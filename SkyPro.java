public class SkyPro {
        public static void main (String[] args) {
//задача 1
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
            System.out.println(  );

// задача 2
            dog += 4;
            cat += 4;
            paper += 4;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
            System.out.println(  );

// задача 3
            dog -= 3.5;
            cat -= 1.6;
            paper -= 7639;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
            System.out.println(  );

// задача 4
            var friend = 19;
            System.out.println(friend);
            friend += 2;
            System.out.println(friend);
            friend /= 7;
            System.out.println(friend);
            System.out.println(  );

// задача 5
            var frog = 3.5;
            System.out.println(frog);
            frog *= 10;
            System.out.println(frog);
            frog /= 3.5;
            System.out.println(frog);
            frog += 4;
            System.out.println(frog);
            System.out.println( );

//задача 6
            var firstWeight = 78.2;
            var secondWeight = 82.7;
            var sumWeight = firstWeight + secondWeight;
            System.out.println("Общий вес бойцов равен " + sumWeight + " кг!");
            var minWeight = secondWeight - firstWeight;
            System.out.println("Разница в весе бойцов равна " + minWeight + " кг!");
            System.out.println( );

//задача 7
            var divOne = firstWeight % secondWeight;
            System.out.println("Остаток от веса первого бойца: " + divOne);
            var divTwo = secondWeight % firstWeight;
            System.out.println("Остаток от веса второго бойца: " + divTwo);
            System.out.println( );

// задача 8
            var allWorkTime = 640;
            var personWorkTime = 8;
            var person = allWorkTime / personWorkTime;
            System.out.println("Всего работников в компании - " + person + " человек");

            person += 94;
            allWorkTime = personWorkTime * person;
            System.out.println("Если в компани работает " + person + " человек, то всего " + allWorkTime + " часов работы может быть поделено между сотрудниками.");
        }
    }
