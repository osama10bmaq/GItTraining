public class Feature{
    private final String featureName;
    private final int featureID;

    public Feature(String featureName, int featureID){
        this.featureName = featureName;
        this.featureID = featureID;
    }

    public String getFeatureName() {
        return featureName;
    }

    public int getFeatureID() {
        return featureID;
    }

    @Override
    public String toString(){
        return "["+featureName+" <-> "+featureID+"]";
    }
}
