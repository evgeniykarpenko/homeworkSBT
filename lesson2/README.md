Class Person SBT homeWork
 ***
* This method checks gender of persons. If genders are not equal - tries to marry.
* If one of them has another spouse - execute divorce(sets spouse = null for husband and wife. Example: if both persons have spouses - then divorce will set 4 spouse to null) and then executes marry().
* @param person - new husband/wife for this person.
* @return - returns true if this person has another gender than passed person and they are not husband and wife, false otherwise

        Person Anton = new Person(true, "Anton");
        Person Anna = new Person(false, "Anna");
        System.out.println(Anna);   //Anna is a woman, not married
        System.out.println(Anton);  //Anton is a man, not married
        Anna.marry(Anton);          //true
        System.out.println(Anna);   //Person name: Anna is a woman, married to Anton
        System.out.println(Anton);  //Person name: Anton is a man, married to Anna
        Person Boris = new Person(true, "Boris");
        System.out.println(Boris);  //Person name: Boris is a man, not married
        Anna.divorce();             //true
        System.out.println(Anna);   //Person name: Anna is a woman, not married
        System.out.println(Anton);  //Person name: Anton is a man, not married
        System.out.println(Boris);  //Person name: Boris is a man, not married
        Boris.marry(Anton);          //false (gender equals)
        Boris.marry(Anna);          //true
        System.out.println(Anna);   //Person name: Anna is a woman, married to Boris
        System.out.println(Anton);  //Person name: Anton is a man, not married
        System.out.println(Boris);  //Person name: Boris is a man, married to Anna
        Anton.marry(Anna);          //true
        System.out.println(Anna);   //Person name: Anna is a woman, married to Anton
        System.out.println(Anton);  //Person name: Anton is a man, married to Anna
        System.out.println(Boris);  //Person name: Boris is a man, not married
        Anton.marry(Anna);          //false (both already married)
        Person Marina = new Person(false, "Marina");
        Boris.marry(Marina);        //true
        System.out.println(Boris);  //Person name: Boris is a man, married to Marina
        System.out.println(Marina); //Person name: Marina is a woman, married to Boris
        Anton.marry(Marina);        //true
        Anna.marry(Boris);          //true
