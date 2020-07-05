package main

import (
	"fmt"
	"math"
)

func main() {
	var t int
	fmt.Scan(&t)
	for ; t >= 0; t-- {
		n := 0
		fmt.Scan(&n)
		for i := 0; i < n; i++ {
			var x float64
			fmt.Scan(&x)
			if i%2 == 0 {
				x = math.Abs(x)
			} else {
				x = -math.Abs(x)
			}
			fmt.Printf("%d ", int64(x))
		}
		fmt.Println()
	}
}
