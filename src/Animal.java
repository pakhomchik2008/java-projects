public class Animal {
    
        public String name;
        public int age;
        public int weight;
        public String[] meals;



        public Animal(String _name,int _age, int _weight,String[]_meals)
        {
            System.out.println("Oject created");
            setValues(_name,_age,_weight,_meals);
            System.out.println(getValues());

        }
        public Animal(String _name,int _age)
        {
            name = _name;
            age = _age;
            System.out.println(getValues());
        }
        public void setValues(String _name,int _age, int _weight,String[]_meals){
            name = _name;
            age = _age;
            weight = _weight;
            meals = _meals;
        }
        public String getValues(){
            String info = "name = " + name + " age = " + age + " weight =  "+weight + " ";
            String infoMeals = "meals u set: \n";
            for(int i = 0;i<meals.length;i++)
            {
                infoMeals+=meals[i] + " "; 
            }
            return info+infoMeals;
        }
        
}
