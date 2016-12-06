exports.handler = (event, context, callback) => {
    
    callback(null, calculatePrimes());
};

function calculatePrimes() {
    var n = 100000;
    var primes = 0;
    for(p = 2; p < n + 1; p++) {
        isPrime = true;
        for(i = 2; i < p; i++) {
            if ( p%i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            primes++;
        }
    }
    return "Number of primes under: " + n + ", are: "+ primes;
}