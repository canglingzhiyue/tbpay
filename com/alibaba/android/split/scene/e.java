package com.alibaba.android.split.scene;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class e implements f<InputStream, Map<String, Map<String, List<String>>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Map<String, List<String>>> f2498a;
    private boolean b;

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final e f2499a;

        static {
            kge.a(-1515790041);
            f2499a = new e();
        }

        public static /* synthetic */ e a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("f26f6f0d", new Object[0]) : f2499a;
        }
    }

    static {
        kge.a(-443601495);
        kge.a(1182398204);
    }

    private e() {
        this.f2498a = new HashMap();
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("f26f6f0d", new Object[0]) : a.a();
    }

    @Override // com.alibaba.android.split.scene.f
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // com.alibaba.android.split.scene.f
    public void a(h<InputStream, Map<String, Map<String, List<String>>>> hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4b222a", new Object[]{this, hVar});
            return;
        }
        this.f2498a = hVar.b();
        this.b = true;
    }

    @Override // com.alibaba.android.split.scene.f
    public List<String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c4a1d4b", new Object[]{this, str, str2});
        }
        if (StringUtils.isEmpty(str)) {
            return new ArrayList();
        }
        if (this.f2498a.containsKey(str)) {
            return this.f2498a.get(str).get(str2);
        }
        return new ArrayList();
    }

    @Override // com.alibaba.android.split.scene.f
    public List<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return new ArrayList();
        }
        if (this.f2498a.containsKey(str)) {
            return this.f2498a.get(str).get("default");
        }
        return new ArrayList();
    }

    @Override // com.alibaba.android.split.scene.f
    public boolean a(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("434e6e27", new Object[]{this, str, str2, strArr})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return true;
        }
        if (StringUtils.isEmpty(str2)) {
            str2 = "default";
        }
        if (this.f2498a.containsKey(str) && this.f2498a.get(str).containsKey(str2)) {
            return this.f2498a.get(str).get(str2).containsAll(Arrays.asList(strArr));
        }
        return true;
    }
}
