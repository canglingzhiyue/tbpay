package com.etao.feimagesearch.model;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.al;
import com.taobao.android.searchbaseframe.util.g;
import java.util.Map;
import tb.com;
import tb.kge;

/* loaded from: classes3.dex */
public class a extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Class sActivityClass;
    public static String sActivityUrl;

    /* renamed from: a  reason: collision with root package name */
    private boolean f6806a;
    private Map<String, String> b;

    static {
        kge.a(-854523626);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 83033702) {
            return super.createJumpIntent();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private a() {
        this.f6806a = false;
        this.b = new ArrayMap();
    }

    public a(e eVar) {
        super(eVar);
        this.f6806a = false;
        this.b = new ArrayMap();
    }

    public a(b bVar) {
        super(bVar);
        this.f6806a = false;
        this.b = new ArrayMap();
        this.b.putAll(bVar.getExtraParams());
    }

    public void setShowVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("795d57c3", new Object[]{this});
        } else {
            this.b.put("album_show_video", "true");
        }
    }

    public boolean isShowVideo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa668bff", new Object[]{this})).booleanValue() : TextUtils.equals("true", this.b.get("album_show_video"));
    }

    public boolean isDirectJumpAfterChoose() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c7d775d", new Object[]{this})).booleanValue() : TextUtils.equals("true", this.b.get("direct_jump_after_album_choose"));
    }

    @Override // com.etao.feimagesearch.model.e
    public Intent a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("fdb8dbab", new Object[]{this});
        }
        if (al.a()) {
            Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            intent.setType("image/*");
            return intent;
        }
        Intent intent2 = new Intent(com.b(), sActivityClass);
        intent2.setAction("android.intent.action.VIEW");
        intent2.addFlags(603979776);
        return intent2;
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
        builder.appendQueryParameter(d.KEY_IRP_GARBAGE, String.valueOf(isGarbageRecognize()));
        String str = "";
        builder.appendQueryParameter("sellerId", getSellerId() == null ? str : getSellerId());
        if (getShopId() != null) {
            str = getShopId();
        }
        builder.appendQueryParameter("shopId", str);
        try {
            if (this.b.isEmpty()) {
                return;
            }
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                builder.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        } catch (Exception unused) {
        }
    }

    public static a parseFromIntent(Intent intent) {
        Uri data;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f6868f3c", new Object[]{intent});
        }
        a aVar = new a();
        if (intent == null || (data = intent.getData()) == null) {
            return aVar;
        }
        aVar.a(data);
        aVar.setGarbageRecognize(data.getBooleanQueryParameter(d.KEY_IRP_GARBAGE, false));
        try {
            if (data.getQueryParameterNames() != null) {
                for (String str : data.getQueryParameterNames()) {
                    if (!b.PRIMARY_KEYS.contains(str) && (queryParameter = data.getQueryParameter(str)) != null) {
                        aVar.b.put(str, queryParameter);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return aVar;
    }

    public int getArType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60064dfb", new Object[]{this})).intValue();
        }
        String str = this.b.get("album_ar_type");
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return -1;
        }
    }

    public int getTabType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7ef5ec33", new Object[]{this})).intValue() : g.b(this.b.get("album_tab_type"), -1);
    }

    @Override // com.etao.feimagesearch.model.e
    public final Intent createJumpIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("4f2fe66", new Object[]{this});
        }
        if (al.a()) {
            return a();
        }
        return super.createJumpIntent();
    }

    public Map<String, String> getExtraParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8093f2fc", new Object[]{this}) : this.b;
    }

    public boolean isGarbageRecognize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e8f0242e", new Object[]{this})).booleanValue() : this.f6806a;
    }

    public void setGarbageRecognize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78797b2", new Object[]{this, new Boolean(z)});
        } else {
            this.f6806a = z;
        }
    }
}
