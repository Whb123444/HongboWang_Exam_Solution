package org.example;


import java.net.URL;
import java.time.LocalDate;
import java.util.spi.LocaleNameProvider;

public class Patient1 {
    private String name = "Daphne Von Oram";
    private int age = 62;
    private String patientPic = "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg";
    private class MRI{
        private String image = "https://martinh.netfirms.com/BIOE60010/mri1.jpg";
        private String fs = "2 Tesla";
        private LocalDate date = LocalDate.of(2023,9,14);
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
        private String Sys = "130 mmHg";
        private String Dia = "70mmHg";
        private LocalDate MD = LocalDate.of(2023,9,15);
        private String Dur = "ST";
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
