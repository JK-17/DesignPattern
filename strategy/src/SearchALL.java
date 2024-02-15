interface SearchStrategy {
    void search();
}
class Context {
    SearchStrategy ss;
    void setSs(SearchStrategy ss){
        this.ss = ss;
    }
    void getStrategywork(){
        this.ss.search();
    }
}
class SearchALL implements SearchStrategy{
    @Override
    public void search() {
        System.out.println("ALL");
    }
}

class SearchYoutue implements SearchStrategy {
    @Override
    public void search() {
        System.out.println("Youtube");
    }
}
class SearchInsta implements SearchStrategy {
    @Override
    public void search() {
        System.out.println("Insta");
    }
}
