public class Employee {
    
    private String code;
    private String name;
    private String gender;
    private String occupation;
    private Integer salary;

    public Employee(
        String code,
        String name,
        String gender,
        String occupation,
        Integer salary) {
            this.code = code;
            this.name = name;
            this.gender = gender;
            this.occupation = occupation;
            this.salary = salary;
        }
        
        public String getCode() {
            return code;
        }
        public void setCode(String code) {
            this.code = code;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        public String getOccupation() {
            return occupation;
        }
        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }
        public Integer getSalary() {
            return salary;
        }
        public void setSalary(Integer salary) {
            this.salary = salary;
        }

}
