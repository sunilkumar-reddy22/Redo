# Split Array Largest Sum (LeetCode 410)

## Problem
Given an array of integers and an integer `k`, split the array into
`k` non-empty contiguous subarrays such that the largest sum among
these subarrays is minimized.

## Approach: Binary Search on Answer
- **Lower bound (`start`)**: the maximum single element in the array
  (a subarray can't have a smaller max sum than the biggest element).
- **Upper bound (`end`)**: the sum of the whole array (worst case:
  everything in one subarray).
- Binary search on the possible "largest sum" value (`mid`).
- For each `mid`, greedily check: can I split the array into pieces
  where no piece's sum exceeds `mid`?
    - If yes and `pieces <= k` → this `mid` works, try smaller (`end = mid`)
    - If it needs more than `k` pieces → `mid` too small, go bigger
      (`start = mid + 1`)

## Bugs I Ran Into
- Initially wrote `start += num` instead of `sum += num` inside the
  greedy check — accidentally corrupted the binary search boundary
  instead of tracking the current piece's running sum.

## Example
```
nums = [7, 2, 5, 10, 8], k = 2
Best split: [7,2,5] (sum=14) and [10,8] (sum=18)
Answer: 18
```