package com.taobao.android.mediapick.media;

import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class LocalMedia extends Media implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int bucketId;
    public long dateAddTime;
    public long dateModifyTime;
    public String displayName;
    public JSONObject extra;
    public int fileSize;
    public int height;
    public int mediaType;
    public String mimeType;
    public int orientation;
    public String path;
    public Uri uri;
    public int width;

    static {
        kge.a(431363649);
        kge.a(1028243835);
        kge.a(-723128125);
    }

    public static /* synthetic */ Object ipc$super(LocalMedia localMedia, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof LocalMedia)) {
            return false;
        }
        LocalMedia localMedia = (LocalMedia) obj;
        return localMedia.id == this.id && localMedia.mediaType == this.mediaType && isExtraEquals(localMedia);
    }

    /* renamed from: clone */
    public LocalMedia m991clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalMedia) ipChange.ipc$dispatch("2d5e4ff4", new Object[]{this});
        }
        try {
            return (LocalMedia) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    private boolean isExtraEquals(LocalMedia localMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99a83638", new Object[]{this, localMedia})).booleanValue();
        }
        JSONObject jSONObject = localMedia.extra;
        JSONObject jSONObject2 = this.extra;
        return jSONObject == jSONObject2 || (jSONObject != null && jSONObject.equals(jSONObject2));
    }
}
