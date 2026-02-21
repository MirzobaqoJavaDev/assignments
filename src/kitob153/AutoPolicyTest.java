package kitob153;

public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy policy1= new AutoPolicy(10000, "Toyate Camry", "NJ");
        AutoPolicy policy2= new AutoPolicy(122220, "Ford Fusion", "MY");
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }
    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
                (policy.isNOFaultState() ? "is": "is not"));
    }
}
