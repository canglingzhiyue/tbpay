package com.etao.feimagesearch.model;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.PicParamUtils;
import com.taobao.android.searchbaseframe.util.g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.com;
import tb.cpe;
import tb.gtr;
import tb.kge;

/* loaded from: classes3.dex */
public class b extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Set<String> PRIMARY_KEYS;
    public static Class sActivityClass;
    public static String sActivityUrl;

    /* renamed from: a  reason: collision with root package name */
    private String f6807a;
    private boolean b;
    private boolean c;
    private String d;
    private String e;
    private boolean g;
    private boolean f = false;
    private boolean h = false;
    private int i = -1;
    private boolean m = false;
    private Map<String, String> j = new HashMap();
    private Map<String, String> k = new HashMap();

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(121158769);
        HashSet hashSet = new HashSet();
        PRIMARY_KEYS = hashSet;
        hashSet.add("tips");
        PRIMARY_KEYS.add("image_id");
        PRIMARY_KEYS.add(d.KEY_AR_TAB);
        PRIMARY_KEYS.add(d.KEY_IRP_GARBAGE);
        PRIMARY_KEYS.add("spm");
        PRIMARY_KEYS.add("sellerId");
        PRIMARY_KEYS.add("shopId");
        PRIMARY_KEYS.add("pssource");
    }

    @Override // com.etao.feimagesearch.model.e
    public Intent a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("fdb8dbab", new Object[]{this}) : new Intent(com.b(), sActivityClass);
    }

    public boolean isDisableAutoDetect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fd0106bb", new Object[]{this})).booleanValue() : this.h;
    }

    @Override // com.etao.feimagesearch.model.e
    public Uri b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("def15b20", new Object[]{this}) : Uri.parse(sActivityUrl);
    }

    @Override // com.etao.feimagesearch.model.e
    public void a(Uri.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b8a4a8", new Object[]{this, builder});
            return;
        }
        builder.appendQueryParameter("image_id", getImageId());
        if (isArTab()) {
            builder.appendQueryParameter(d.KEY_AR_TAB, "1");
        }
        if (isGarbageTab()) {
            builder.appendQueryParameter(d.KEY_IRP_GARBAGE, String.valueOf(true));
        }
        if (!TextUtils.isEmpty(this.e)) {
            builder.appendQueryParameter("spm", this.e);
        }
        if (!TextUtils.isEmpty(this.d)) {
            builder.appendQueryParameter("tips", this.d);
        }
        if (!TextUtils.isEmpty(getSellerId())) {
            builder.appendQueryParameter("sellerId", getSellerId());
        }
        if (!TextUtils.isEmpty(getShopId())) {
            builder.appendQueryParameter("shopId", getShopId());
        }
        try {
            if (this.j.isEmpty()) {
                return;
            }
            for (Map.Entry<String, String> entry : this.j.entrySet()) {
                builder.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        } catch (Exception unused) {
        }
    }

    public void updateCameraMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55862be2", new Object[]{this, str});
        } else {
            this.j.put(PicParamUtils.b(), str);
        }
    }

    public Map<String, String> getExtraParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8093f2fc", new Object[]{this}) : this.j;
    }

    public void appendExtraParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d06462", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            this.j.putAll(map);
        }
    }

    public Map<String, String> getAllParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b1c000d", new Object[]{this}) : this.k;
    }

    public void setOpenHistory(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e2ef05", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public boolean isOpenHistory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d649ffeb", new Object[]{this})).booleanValue() : this.f;
    }

    public static b parseFromIntent(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f6868f5b", new Object[]{intent});
        }
        b bVar = new b();
        if (intent == null || (data = intent.getData()) == null) {
            return bVar;
        }
        bVar.h = data.getBooleanQueryParameter("disableAutoDetect", false);
        bVar.m = data.getBooleanQueryParameter("scanOnly", false);
        bVar.a(data);
        if (TextUtils.isEmpty(bVar.getPssource())) {
            String queryParameter = data.getQueryParameter("_pssource");
            if (!TextUtils.isEmpty(queryParameter)) {
                bVar.setPssource(queryParameter);
            }
        }
        bVar.b(data.getQueryParameter("tips"));
        String queryParameter2 = data.getQueryParameter("image_id");
        String queryParameter3 = data.getQueryParameter(d.KEY_AR_TAB);
        String queryParameter4 = data.getQueryParameter(d.KEY_IRP_GARBAGE);
        String queryParameter5 = data.getQueryParameter("spm");
        boolean a2 = gtr.a(intent);
        bVar.g = a2;
        if (a2 && TextUtils.isEmpty(bVar.getPssource())) {
            bVar.setPssource(cpe.PsSourceSY_SYS);
        }
        String queryParameter6 = data.getQueryParameter("sellerId");
        String queryParameter7 = data.getQueryParameter("shopId");
        bVar.setSellerId(queryParameter6);
        bVar.setShopId(queryParameter7);
        bVar.setOpenHistory(data.getBooleanQueryParameter(d.KEY_OPEN_HISTORY, false));
        bVar.a(queryParameter5);
        bVar.setImageId(queryParameter2);
        String queryParameter8 = data.getQueryParameter("toindex");
        if (!TextUtils.isEmpty(queryParameter8)) {
            try {
                bVar.i = Integer.parseInt(queryParameter8);
                if (!com.etao.feimagesearch.config.b.o() && bVar.i > 2) {
                    bVar.i = 2;
                }
            } catch (Exception unused) {
                bVar.i = -1;
            }
        }
        if ("1".equals(queryParameter3) || "true".equals(queryParameter3)) {
            bVar.setArTab(true);
        } else if ("1".equals(queryParameter4) || "true".equals(queryParameter4)) {
            bVar.setGarbageTab(true);
        } else {
            bVar.setArTab(false);
        }
        if (TextUtils.isEmpty(bVar.getPssource()) && bVar.i == 1) {
            bVar.setPssource("saotab");
        }
        try {
            if (data.getQueryParameterNames() != null) {
                for (String str : data.getQueryParameterNames()) {
                    String queryParameter9 = data.getQueryParameter(str);
                    if (queryParameter9 != null) {
                        if (PRIMARY_KEYS.contains(str)) {
                            bVar.k.put(str, queryParameter9);
                        } else {
                            bVar.j.put(str, queryParameter9);
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return bVar;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    private int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.i;
    }

    public String getImageId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("342caf59", new Object[]{this}) : this.f6807a;
    }

    public void setImageId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586cc4a5", new Object[]{this, str});
        } else {
            this.f6807a = str;
        }
    }

    public boolean isArTab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcfd5625", new Object[]{this})).booleanValue() : this.b;
    }

    public void setArTab(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da82a0b", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public String getPageFromHint() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eadcb543", new Object[]{this}) : this.d;
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void setGarbageTab(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0da74b", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public boolean isGarbageTab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8cf47375", new Object[]{this})).booleanValue() : this.c;
    }

    public boolean isFromScan() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cede89c", new Object[]{this})).booleanValue() : this.g;
    }

    public boolean isFromNoFrontRetake(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6b8d343", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return g.a(this.j.remove("fromNoFrontRetake"), false);
        }
        return g.a(this.j.get("fromNoFrontRetake"), false);
    }

    public boolean scanOnly() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d6ee4bd4", new Object[]{this})).booleanValue() : this.m;
    }

    public boolean isOtherChannelPhotoSearch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53eefe28", new Object[]{this})).booleanValue() : TextUtils.equals(this.j.get("otherChannelPhotoSearch"), "true");
    }

    public int getInitTabIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c9814dd", new Object[]{this})).intValue();
        }
        int c = c();
        return c > 0 ? c == 1 ? 0 : 1 : isFromScan() ? 0 : 1;
    }

    public String getInitScene() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("56781413", new Object[]{this}) : cpe.b.a(Integer.valueOf(getInitTabIndex()));
    }
}
