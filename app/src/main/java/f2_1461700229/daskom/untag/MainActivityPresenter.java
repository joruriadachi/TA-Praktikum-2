package f2_1461700229.daskom.untag;

public class MainActivityPresenter {
    MainActivityView view;

    public MainActivityPresenter(MainActivityView view){
        this.view = view;
    }

    public void olahData (String nbi, String pass){
        int nbi1 = Integer.parseInt(nbi), pass1 = Integer.parseInt(pass);
        int cekPass = 0;
        if (nbi1 == 1461700229 & pass1 == 6690){
            cekPass = 1;
        }
        view.setHasil(cekPass);

    }
}
