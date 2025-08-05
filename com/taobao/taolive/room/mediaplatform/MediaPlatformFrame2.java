package com.taobao.taolive.room.mediaplatform;

import android.content.Context;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.kge;

/* loaded from: classes8.dex */
public class MediaPlatformFrame2 extends MediaPlatformFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(953428036);
    }

    public static /* synthetic */ Object ipc$super(MediaPlatformFrame2 mediaPlatformFrame2, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1257959318) {
            super.onDidDisappear();
            return null;
        } else if (hashCode != -553924265) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
            return null;
        }
    }

    @Override // com.taobao.taolive.room.mediaplatform.MediaPlatformFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        }
    }

    @Deprecated
    public MediaPlatformFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
    }

    public MediaPlatformFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
        } else {
            super.onDidDisappear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        if (i != 1) {
            return;
        }
        init();
    }
}
