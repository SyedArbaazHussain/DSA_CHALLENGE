// Problem: Given a list of integers and a target value, find two distinct indices whose values sum up to the target. Return the pair of indices.

// Solution:
const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const ask = (query) => new Promise(resolve => rl.question(query, resolve));

async function main() {
    let a = [], b = [];
    let target = 0, i = 0;

    let aSize = Number(await ask("Enter a size value for Array a: "));
    let bSize = Number(await ask("Enter a size value for Array b: "));

    console.log("Enter elements for Array a:");
    for (i = 0; i < aSize; i++) {
        a[i] = Number(await ask(`a[${i}]: `));
    }

    console.log("Enter elements for Array b:");
    for (i = 0; i < bSize; i++) {
        b[i] = Number(await ask(`b[${i}]: `));
    }

    target = Number(await ask("Enter a target value to search: "));

    console.log("\nSearching...");
    solution(a, b, target);

    rl.close();
}

function solution(a, b, target) {
    let flag = 0;

    for (let i = 0; i < a.length; i++) {
        for (let j = 0; j < b.length; j++) {
            if (a[i] + b[j] === target) {
                if (!flag) console.log("\nMatch Found:");
                flag = 1;
                console.log(`a[${i}] = ${a[i]}, b[${j}] = ${b[j]}`);
            }
        }
    }

    if (!flag) {
        console.log("\nNo match found");
    }
}

main();