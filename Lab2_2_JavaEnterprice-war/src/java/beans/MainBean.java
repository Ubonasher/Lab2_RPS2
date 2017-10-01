package beans;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import dao.ExperimentBean;
import javax.transaction.SystemException;

@Named
@RequestScoped
public class MainBean {

    @EJB
    ExperimentBean experimentBean;

    public String getFirstExperiment() {
        return experimentBean.firstExperiment();
    }

    public String getSecondExperiment() {
        return experimentBean.secondExperiment();
    }

    public String getThirdExperiment() {
        return experimentBean.thirdExperiment();
    }

    public String getFourthExperiment() throws IllegalStateException, SystemException {
        return experimentBean.fourthExperiment();
    }

    public String getFifthExperiment() {
        return experimentBean.fifthExperiment();
    }
}
