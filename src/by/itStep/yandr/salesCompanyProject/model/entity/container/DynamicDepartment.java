package by.itStep.yandr.salesCompanyProject.model.entity.container;

import by.itStep.yandr.salesCompanyProject.model.entity.abstracts.Staff;

public class DynamicDepartment implements Department,Iterable{
    private Staff[] staff;

    public DynamicDepartment() {
        staff = new Staff[0];
    }


}
