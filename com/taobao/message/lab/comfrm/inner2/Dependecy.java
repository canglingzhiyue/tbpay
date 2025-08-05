package com.taobao.message.lab.comfrm.inner2;

import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes7.dex */
public class Dependecy {
    public Set<String> readPropKeySet = new HashSet();
    public Set<String> readOriginDataKeySet = new HashSet();
    public Set<String> readRuntimeDataKeySet = new HashSet();
    public Set<String> readJsRuntimeDataKeySet = new HashSet();
    public Set<Pair<String, String>> readPropInstanceKeySet = new HashSet();
    public Set<Pair<String, String>> readOriginDataInstanceKeySet = new HashSet();
    public Set<Pair<String, String>> readRuntimeDataInstanceKeySet = new HashSet();
    public Set<Pair<String, String>> readJsRuntimeDataInstanceKeySet = new HashSet();
    public Map<String, Object> writeRuntimeDataKeyMap = new HashMap();
    public Map<String, Object> writeJsRuntimeDataKeyMap = new HashMap();
    public Map<Pair<String, String>, Object> writeRuntimeDataInstanceKeyMap = new HashMap();
    public Map<Pair<String, String>, Object> writeJsRuntimeDataInstanceKeyMap = new HashMap();

    static {
        kge.a(-1574923666);
    }
}
