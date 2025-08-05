package com.android.tools.bundleInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class DynamicFeatureInfo implements Serializable {
    public String appVersion;
    public String featureInitalClass;
    public String featureName;
    public String matchedAppVersion;
    public String matchedFeatureMd5;
    public String md5;
    public int priority;
    public long size;
    public String url;
    public String version;
    public Map<String, String> matchedAppFeatureMd5 = new HashMap();
    public List<String> dependencies = new ArrayList();
    public List<String> bindingActivities = new ArrayList();
    public List<String> views = new ArrayList();
    public Map<String, String> implServices = new HashMap();
    public List<String> classes = new ArrayList();
    public List<String> fragments = new ArrayList();
    public int status = 0;
}
