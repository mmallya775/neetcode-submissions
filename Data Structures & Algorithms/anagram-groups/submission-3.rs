impl Solution {
    pub fn group_anagrams(strs: Vec<String>) -> Vec<Vec<String>> {
        let mut res: HashMap<[u8; 26], Vec<String>> = HashMap::new();

        for s in strs {
            let mut k: [u8; 26] = [0u8; 26];
            for c in s.bytes() {
                k[(c - b'a') as usize] += 1;
            }

            res.entry(k).or_default().push(s);
        }

        res.into_values().collect::<Vec<Vec<String>>>()
    }
}