package rocks.zipcode.io.quiz3.collections;

import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    List<Lab> labs;

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab : labs) {
            if (labName == lab.name) {
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        for (Lab lab : labs) {
            if (labName == lab.name) {
                lab.setStatus(labStatus);
            }
        }
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        for (Lab lab : labs) {
            if (labName == lab.getName()) {
                return lab.getStatus();
            }
        }
        return null;
    }
}
