public enum MonthEnum{

    JANUARY("JANEIRO", 20000.00),
    FEBRUARY("FEVEREIRO", 15000.00),
    MARCH("MARÇO", 8438.00),
    APRIL("ABRIL", 38743.00),
    MAY("MAIO", 27000.00),
    JUNE("JUNHO", 13000.00),
    JULY("JULHO", 17999.00),
    AUGUST("AGOSTO", 20012.00),
    SEPTEMBER("SETEMBRO", 38732.00),
    OCTOBER("OUTUBRO", 17321.10),
    NOVEMBER("NOVEMBRO", 23000.00),
    DECEMBER("DEZEMBRO", 25000.00);

    private String descricao;

    private Double expensive;

    MonthEnum(String descricao, Double expensive) {
        this.descricao = descricao;
        this.expensive = expensive;
    }

    public static MonthEnum geMonthEnum(String descricao){
        MonthEnum mes = null;
        if(!descricao.isEmpty()) {
            if(JANUARY.descricao.equals(descricao)){
                mes = JANUARY;
            } else if(FEBRUARY.descricao.equals(descricao)){
                mes = FEBRUARY;
            } else if(MARCH.descricao.equals(descricao)){
                mes = MARCH;
            } else if(APRIL.descricao.equals(descricao)){
                mes = APRIL;
            } else if(MAY.descricao.equals(descricao)){
                mes = MAY;
            } else if(JUNE.descricao.equals(descricao)){
                mes = JUNE;
            } else if(JULY.descricao.equals(descricao)){
                mes = JULY;
            } else if(AUGUST.descricao.equals(descricao)){
                mes = AUGUST;
            } else if(SEPTEMBER.descricao.equals(descricao)){
                mes = SEPTEMBER;
            } else if(OCTOBER.descricao.equals(descricao)){
                mes = OCTOBER;
            } else if(NOVEMBER.descricao.equals(descricao)){
                mes = NOVEMBER;
            } else if(DECEMBER.descricao.equals(descricao)){
                mes = DECEMBER;
            }
        }
        return mes;
    }


    public void setExpensive(Double expensive) {
        this.expensive = expensive;
    }

    public Double getExpensive() {
        return expensive;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}