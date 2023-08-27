
const arr = [64, 34, 25, 11, 22, 12, 90]; // 12 12 22 25 34 64 90

let min=arr[0];
let next=arr[1];

const findMinNumber=(array)=>{
    let min=array[0];
    for( let num of array){
        if( num < min){
            min=num;
        }
    }
    return min;
}

console.log(findMinNumber(arr)); //11

const first=findMinNumber(arr); //11
let array=[];

const numOrders=(first, next, num)=>{
    if (Math.abs(first - num) !== 0) {
        if (Math.abs(first - next) > Math.abs(first - num)) {
            next = num;
        }
    }
}

const makeASC=()=>{
    for(let num of arr) {
        for(let i=0; i<arr.length; i++) {
            numOrders(i, i+1, num);
            // if (Math.abs(minFound - num) !== 0) {
            //     if (Math.abs(minFound - second) > Math.abs(minFound - num)) {
            //         second = num;
            //     }
            // }
        }
    }
    return next;
}

console.log('makeASC()>>', makeASC());


const arr1 = [62, 34, 25, 2, 22, 12, 90];

const makeArray=()=>{
    let newArr=[];
    for(let i=0; i<arr1.length-1; i++){ //i=6
        if( arr1[i] > arr1[i+1]){
            newArr[i]=arr1[i+1];
            newArr[i+1]=arr1[i];
        }
    }
    return newArr;
}

console.log(makeArray());

console.log('--------------------');

let arr2=[61, 34, 25, 2, 22, 12, 90];
console.log(findMinNumber(arr2)); //2
let arr22=arr2.slice();

    let newArrr=[]; // 2빼고 나머지 나옴.
    let answer=[];
const decreasedArr=(array)=>{
    let tmp;
    let idx=0;
    for(let i=0; i<array.length;i++){
       // for(let j=0; j<arr.length; j++){
            if(array[i] > findMinNumber(array)){
               // tmp=arr2[i];
               // newArrr[idx]=tmp;
                newArrr[idx]=array[i];
                idx++;
            }
        //}
    }
    return newArrr;
}

console.log('decreasedArr', decreasedArr(arr2)); //[61, 34, 25, 22, 12, 90]

    let arr3=[];
const getMin=(array)=>{
    let idx=0;
   for(let i=0; i<array.length;i++){
       if ( array[i] === findMinNumber(array)){
           arr3[idx]=array[i];
           idx++;
       }
   }
   return arr3;
}
console.log('getMin(arr2)>>>', getMin(arr2)); // [2]
console.log('getMin(newArrr)>>', getMin(newArrr)); // [12]

// const answer1=(array, callback)=>{
//     let newArr=[];
//     let min;
//     newArr=callback(array);
//     min=findMinNumber(newArr);
// }

//console.log('answer>>', answer1(arr2));
console.log(findMinNumber(decreasedArr(arr2)));

const test=(array)=>{
    let tmp;
    for(let i=0; i<array.length; i++){
        if( array[i] === findMinNumber(decreasedArr(array))){
            tmp=array[i];
        }
    }
    return tmp;
}

console.log(test(decreasedArr(arr2)))
//let arr2=[61, 34, 25, 2, 22, 12, 90];

const test1=(array)=>{
    let idx;
    let first;
    let newArr=[];
    for(let i=0; i<array.length; i++){
            if( array[i] > findMinNumber(decreasedArr(array))  ){

            }


        }
    return newArr;

}

let n=[];
n=decreasedArr(arr2);

console.log('n>>', findMinNumber(decreasedArr(decreasedArr(array)) ));

    let newArr=[];
const aa=(array, newArr)=>{
    let Arr=[];
    let idx=0;
    for(let i=0; i<array.length; i++ ){
        newArr= decreasedArr(array);
    }
//   return  findMinNumber(newArr1);
}
console.log('nn>>', aa(arr2))

const arr4=[61, 34, 25, 2, 22, 12, 90];

const bb = (array) => {
    let newArr = array.slice();

    for (let i = 0; i < newArr.length - 1; i++) {
        let minIdx = i;

        for (let j = i + 1; j < newArr.length; j++) {
            if (newArr[minIdx] > newArr[j]) {
                minIdx = j;
            }
        }

        if (minIdx !== i) {
            // 가장 작은 값과 현재 인덱스의 값 교환
            let temp = newArr[i];
            newArr[i] = newArr[minIdx];
            newArr[minIdx] = temp;
        }
    }
    return newArr;
};
console.log('bb>>', bb(arr4)); // index가 3

const books=['Reasons and Person', "Derek", 'moby dick' ];
function removeItem(items, removable){
    const index=items.indexOf(removable); // 1
    console.log(index);
    return [...items.slice(0, index), ...items.slice(index+1)]
}
console.log(removeItem(books, 'Derek'))

const book=['Reasons and Person', "Derek", 19.02 ];
const formatBook=(title, author, price)=>{
    return `${title} by ${author} $${price}`;
}
console.log(formatBook(...book))

const cart = [
    {
        name: 'The Foundation Triology',
        price: 19.99,
        discount: false,
    },
    {
        name: 'Godel, Escher, Bach',
        price: 15.99,
        discount: false,
    },
    {
        name: 'Red Mars',
        price: 5.99,
        discount: true,
    },
];

const reward = {
    name: 'Guide to Science Fiction',
    discount: true,
    price: 0,
};

function addFreeGift(cart){
    if(cart.length>2){

        return [...cart, reward];
    }
    return cart;
}

const summarizeCart=(cart)=>{
    const discountable=cart.filter(item => item.discount);
    if(discountable.length>1){
        return {
            error: `할인 상품은 하나만 주문할 수 있습니다.`
        }
    }
    const cartWithReward=addFreeGift(cart);
    return {
        discount:discountable.length,
        items:cartWithReward.length,
        cart:cartWithReward
    }
}
console.log(summarizeCart(cart));
console.log(addFreeGift(cart))

const staff = [
    {
        name: 'Joe',
        years: 10,
    },
    {
        name: 'Theo',
        years: 5,
    },
    {
        name: 'Dyan',
        years: 10,
    },
];
const staff1=[...staff];

function sortByYears(a,b){
    if(a.years === b.years){
        return 'ok';
    }
    return a.years - b.years;
}
const sortByName=(a,b)=>{
    if(a.name === b.name){
        return 0;
    }
    return a.name > b.name ? 1:-1;
}

console.log(staff.sort(sortByYears))
console.log(staff.map(s=>s.name))

    const arr5=[61, 1, 25, 12, 22, 10, 19];
    const arr6=arr5.slice();

const findMin=()=>{
    let idx=0;
    let min=arr5[0];
    for(let i=0; i<arr5.length; i++){
        if(min > arr5[i]){
            min=arr5[i]; // i=1
            idx=i;
            arr6[0]=arr5[idx];
            arr6[idx]=arr5[0];

        }
        // for(let j=0; j<arr5.length; j++){
        //     if( )
        // }
    }//--외부 for
    return arr6;
}
console.log('findMin11>>', findMin())

