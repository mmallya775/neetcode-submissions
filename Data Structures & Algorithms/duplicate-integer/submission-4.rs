impl Solution {
    pub fn has_duplicate(nums: Vec<i32>) -> bool {
        let mut elem = HashSet::new();
        for num in nums {
            if elem.contains(&num) {
                return true;
            } else {
                elem.insert(num);
            }
        }

        false
    }
}