class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        int windowSize = n - k;

        int totalSum = 0;

        for (int points : cardPoints) {
            totalSum += points;
        }

        int windowSum = 0;

        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minWindowSum = windowSum;

        for (int right = windowSize; right < n; right++) {

            windowSum += cardPoints[right];
            windowSum -= cardPoints[right - windowSize];

            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return totalSum - minWindowSum;
    }
}
