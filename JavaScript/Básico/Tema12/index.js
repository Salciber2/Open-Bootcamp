const fibonacci = (num) => {
    let array_fibonacci = [ ];
    let num_anterior = 0;
    let num_actual = 1;

    for (i = 0 ; i < num ; i++){        
        array_fibonacci = [...array_fibonacci, num_actual + num_anterior];
        num_actual = array_fibonacci[i]; 
        if (array_fibonacci.length > 1) num_anterior = array_fibonacci[i - 1];
    }

    return array_fibonacci;
}

console.log(fibonacci(10));