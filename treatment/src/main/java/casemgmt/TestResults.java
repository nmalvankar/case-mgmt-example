package casemgmt;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TestResults implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "BloodPressure")
   private java.lang.Float bloodPressure;
   @org.kie.api.definition.type.Label(value = "ProteinInUrine")
   private java.lang.Boolean proteinInUrine;

   public TestResults()
   {
   }

   public java.lang.Float getBloodPressure()
   {
      return this.bloodPressure;
   }

   public void setBloodPressure(java.lang.Float bloodPressure)
   {
      this.bloodPressure = bloodPressure;
   }

   public java.lang.Boolean getProteinInUrine()
   {
      return this.proteinInUrine;
   }

   public void setProteinInUrine(java.lang.Boolean proteinInUrine)
   {
      this.proteinInUrine = proteinInUrine;
   }

   public TestResults(java.lang.Float bloodPressure,
         java.lang.Boolean proteinInUrine)
   {
      this.bloodPressure = bloodPressure;
      this.proteinInUrine = proteinInUrine;
   }

}