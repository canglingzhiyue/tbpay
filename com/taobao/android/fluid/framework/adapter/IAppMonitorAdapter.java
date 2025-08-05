package com.taobao.android.fluid.framework.adapter;

import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface IAppMonitorAdapter extends IAdapter {
    public static final String ADAPTER_NAME = "IAppMonitorAdapter";

    void alarmCommitFail(String str, String str2, String str3, String str4, String str5);

    void alarmCommitSuccess(String str, String str2, String str3);

    void counterCommit(String str, String str2, String str3, double d);

    void registerStat(String str, String str2, List<String> list, List<String> list2, boolean z);

    void statCommit(String str, String str2, Map<String, Double> map, Map<String, String> map2);
}
