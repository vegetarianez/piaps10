class AdministrativeEmployee extends Employee {
    public AdministrativeEmployee(int socialSecurityNumber, String name, String email) {
        super(socialSecurityNumber, name, email);
    }

    @Override
    public String getPosition() {
        return "Административный сотрудник";
    }
}