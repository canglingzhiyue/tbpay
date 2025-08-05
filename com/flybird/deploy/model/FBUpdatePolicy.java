package com.flybird.deploy.model;

/* loaded from: classes4.dex */
public class FBUpdatePolicy {

    /* loaded from: classes4.dex */
    public enum DeploymentType {
        BasicDeployment("1"),
        EnhancedDeployment("0"),
        PackageDeployment("2");
        
        public final String inEventLogValue;

        DeploymentType(String str) {
            this.inEventLogValue = str;
        }
    }
}
