package org.example;

import java.time.LocalDate;

public class Patient2 {
    private String name = "Sebastian Compton";
    private int age = 31;
    private String patientPic = "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg";
    private class MRI{
        private String image = "https://martinh.netfirms.com/BIOE60010/mri2.jpg";
        private String fs = "4 Tesla";
        private LocalDate date = LocalDate.of(2023,11,19);
        public String get_image(){
            return image;
        }
        public String get_fs(){
            return fs;
        }
        public LocalDate get_date(){
            return date;
        }
    }
    private class BP{
        private String Sys = "150 mmHg";
        private String Dia = "80mmHg";
        private LocalDate MD = LocalDate.of(2023,11,20);
        private String Dur = "VST";
        public String get_Sys(){
            return Sys;
        }
        public String get_Dia(){
            return Dia;
        }
        public LocalDate get_MD(){
            return MD;
        }
        public String get_Dur(){
            return Dur;
        }
    }
    public String get_name(){
        return name;
    }
    public int get_age(){
        return age;
    }
    public String get_patientPic(){
        return patientPic;
    }
    public String get_image(){
        MRI mri = new MRI();
        return mri.get_image();
    }
    public String get_fs(){
        MRI mri = new MRI();
        return mri.get_fs();
    }
    public LocalDate get_date(){
        MRI mri = new MRI();
        return mri.get_date();
    }
    public String get_Sys(){
        BP bp = new BP();
        return bp.get_Sys();
    }
    public String get_Dia(){
        BP bp = new BP();
        return bp.get_Dia();
    }
    public LocalDate get_MD(){
        BP bp = new BP();
        return bp.get_MD();
    }
    public String get_Dur(){
        BP bp = new BP();
        return bp.get_Dur();
    }
}
