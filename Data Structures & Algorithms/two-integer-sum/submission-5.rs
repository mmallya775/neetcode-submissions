impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        let mut indices = HashMap::new();

        for (i, &item) in nums.iter().enumerate() {
            if let Some(&j) = indices.get(&(target - item)) {
                return vec![j, i as i32];
            }

            indices.insert(item, i as i32);
        }

        vec![]
    }
}