package com.taobao.interact.core.h5;

import android.os.RemoteException;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class WVInteractsdkAudio extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PAUSE_ACTION = "pause";
    private static final String PLAY_ACTION = "play";
    private static final String RESUME_ACTION = "resume";
    private static final String STOP_ACTION = "stop";
    private a mAudioJSONParams;
    private WVCallBackContext mCallback;
    private Map<String, com.taobao.interact.mediaplayer.service.a> mMediaPlayerPool = Collections.synchronizedMap(new HashMap());

    static {
        kge.a(959421289);
    }

    public static /* synthetic */ Object ipc$super(WVInteractsdkAudio wVInteractsdkAudio, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        this.mCallback = wVCallBackContext;
        try {
            this.mAudioJSONParams = a.a(new JSONObject(str2));
            str3 = this.mAudioJSONParams.e;
        } catch (RemoteException e) {
            e.printStackTrace();
            wVCallBackContext.error(e.getMessage());
        } catch (JSONException e2) {
            e2.printStackTrace();
            wVCallBackContext.error(e2.getMessage());
        }
        if (TextUtils.isEmpty(str3)) {
            this.mCallback.error("identifier is null");
            return false;
        }
        if (!this.mMediaPlayerPool.containsKey(str3)) {
            this.mMediaPlayerPool.put(str3, new com.taobao.interact.mediaplayer.service.b(this.mContext, str3));
        }
        if (str.equalsIgnoreCase("play")) {
            play(str3);
            return true;
        } else if (str.equalsIgnoreCase("pause")) {
            pause(str3);
            return true;
        } else if (str.equalsIgnoreCase("resume")) {
            resume(str3);
            return true;
        } else {
            if (str.equalsIgnoreCase("stop")) {
                stop(str3);
                return true;
            }
            return false;
        }
    }

    private void play(String str) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f858a6c5", new Object[]{this, str});
            return;
        }
        com.taobao.interact.mediaplayer.service.a aVar = this.mMediaPlayerPool.get(str);
        aVar.a(this.mAudioJSONParams.c);
        aVar.a((float) this.mAudioJSONParams.d, (float) this.mAudioJSONParams.d);
        if (this.mAudioJSONParams.b) {
            aVar.b(this.mAudioJSONParams.f17594a);
        } else {
            aVar.a(this.mAudioJSONParams.f17594a);
        }
        this.mCallback.success();
    }

    private void pause(String str) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8202e407", new Object[]{this, str});
            return;
        }
        this.mMediaPlayerPool.get(str).b();
        this.mCallback.success();
    }

    private void resume(String str) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81daf2fe", new Object[]{this, str});
            return;
        }
        this.mMediaPlayerPool.get(str).a();
        this.mCallback.success();
    }

    private void stop(String str) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbe7513", new Object[]{this, str});
            return;
        }
        this.mMediaPlayerPool.get(str).c();
        this.mCallback.success();
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        for (com.taobao.interact.mediaplayer.service.a aVar : this.mMediaPlayerPool.values()) {
            try {
                aVar.c();
                aVar.d();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        this.mMediaPlayerPool.clear();
        super.onDestroy();
    }
}
