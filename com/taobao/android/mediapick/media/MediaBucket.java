package com.taobao.android.mediapick.media;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public final class MediaBucket extends LocalMedia implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int bucketType;
    public int count;

    static {
        kge.a(-1567096602);
        kge.a(1028243835);
    }

    public static /* synthetic */ Object ipc$super(MediaBucket mediaBucket, String str, Object... objArr) {
        if (str.hashCode() == 1814730534) {
            return new Boolean(super.equals(objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.mediapick.media.LocalMedia
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue() : super.equals(obj) && (obj instanceof LocalMedia) && ((LocalMedia) obj).bucketId == this.bucketId;
    }
}
