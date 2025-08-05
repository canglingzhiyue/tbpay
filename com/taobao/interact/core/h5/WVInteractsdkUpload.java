package com.taobao.interact.core.h5;

import android.content.Context;
import android.os.RemoteException;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.interact.publish.service.c;
import com.taobao.interact.upload.service.FileUploadBaseListener;
import com.taobao.interact.upload.service.MtopInfo;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class WVInteractsdkUpload extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String UPLOAD_ACTION = "InteractSDKUpload";
    private static final String UPLOAD_FAILED_EVENT_NAME = "WVPhoto.Event.uploadPhotoFailed";
    private static final String UPLOAD_PROGRESS_EVENT_NAME = "WVPhoto.Event.V2.progress";
    private static final String UPLOAD_START_EVENT_NAME = "WVPhoto.Event.prepareUploadPhotoSuccess";
    private static final String UPLOAD_SUCCESS_EVENT_NAME = "WVPhoto.Event.uploadPhotoSuccess";
    private long mBytesTotal;
    private WVCallBackContext mCallback;
    private com.taobao.interact.upload.service.b mIUpload;
    private int mUploadIndex;
    private int mUploadSuccessCounts;
    private Object mProgressLock = new Object();
    private JSONArray mUploadSuccessArray = new JSONArray();

    static {
        kge.a(245498062);
    }

    public static /* synthetic */ Object ipc$super(WVInteractsdkUpload wVInteractsdkUpload, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode != 1743254097) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1], objArr[2]);
            return null;
        }
    }

    public static /* synthetic */ int access$000(WVInteractsdkUpload wVInteractsdkUpload) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7ed4db8f", new Object[]{wVInteractsdkUpload})).intValue() : wVInteractsdkUpload.mUploadIndex;
    }

    public static /* synthetic */ WVCallBackContext access$100(WVInteractsdkUpload wVInteractsdkUpload) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("c9cc37b8", new Object[]{wVInteractsdkUpload}) : wVInteractsdkUpload.mCallback;
    }

    public static /* synthetic */ long access$200(WVInteractsdkUpload wVInteractsdkUpload) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8141814e", new Object[]{wVInteractsdkUpload})).longValue() : wVInteractsdkUpload.mBytesTotal;
    }

    public static /* synthetic */ Object access$300(WVInteractsdkUpload wVInteractsdkUpload) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c49d1c19", new Object[]{wVInteractsdkUpload}) : wVInteractsdkUpload.mProgressLock;
    }

    public static /* synthetic */ int access$400(WVInteractsdkUpload wVInteractsdkUpload) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("83ae270b", new Object[]{wVInteractsdkUpload})).intValue() : wVInteractsdkUpload.mUploadSuccessCounts;
    }

    public static /* synthetic */ int access$408(WVInteractsdkUpload wVInteractsdkUpload) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("548a1c03", new Object[]{wVInteractsdkUpload})).intValue();
        }
        int i = wVInteractsdkUpload.mUploadSuccessCounts;
        wVInteractsdkUpload.mUploadSuccessCounts = i + 1;
        return i;
    }

    public static /* synthetic */ JSONArray access$500(WVInteractsdkUpload wVInteractsdkUpload) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("77cb1f59", new Object[]{wVInteractsdkUpload}) : wVInteractsdkUpload.mUploadSuccessArray;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (UPLOAD_ACTION.equalsIgnoreCase(str)) {
            try {
                uploadFiles(b.a(new JSONObject(str2)), wVCallBackContext);
                return true;
            } catch (RemoteException e) {
                e.printStackTrace();
                wVCallBackContext.error(e.getMessage());
            } catch (JSONException e2) {
                e2.printStackTrace();
                wVCallBackContext.error(e2.getMessage());
            }
        }
        return false;
    }

    public void uploadFiles(b bVar, final WVCallBackContext wVCallBackContext) throws RemoteException {
        WVInteractsdkUpload wVInteractsdkUpload = this;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec93a6f7", new Object[]{wVInteractsdkUpload, bVar, wVCallBackContext});
            return;
        }
        wVInteractsdkUpload.mCallback = wVCallBackContext;
        JSONArray jSONArray = bVar.r;
        if (jSONArray == null) {
            return;
        }
        final JSONArray jSONArray2 = bVar.x;
        final JSONArray jSONArray3 = bVar.y;
        MtopInfo mtopInfo = new MtopInfo();
        mtopInfo.setBizCode(bVar.q);
        String str = bVar.k;
        if (!TextUtils.isEmpty(str)) {
            mtopInfo.setOwnerNick(str);
        }
        final int length = jSONArray.length();
        final long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            wVInteractsdkUpload.mBytesTotal += new File(jSONArray.optString(i)).length();
        }
        int i2 = 0;
        while (i2 < length) {
            wVInteractsdkUpload.mUploadIndex = i2;
            wVInteractsdkUpload.mIUpload.a(jSONArray.optString(i2), mtopInfo, new FileUploadBaseListener.Stub() { // from class: com.taobao.interact.core.h5.WVInteractsdkUpload.1
                private int index;
                private r mProgressResult = new r();

                {
                    this.index = WVInteractsdkUpload.access$000(WVInteractsdkUpload.this);
                }

                @Override // com.taobao.interact.upload.service.FileUploadBaseListener
                public void onStart() throws RemoteException {
                    r rVar = new r();
                    rVar.b();
                    WVInteractsdkUpload.access$100(WVInteractsdkUpload.this).fireEvent(WVInteractsdkUpload.UPLOAD_START_EVENT_NAME, rVar.d());
                }

                @Override // com.taobao.interact.upload.service.FileUploadBaseListener
                public void onProgress(long j, long j2) throws RemoteException {
                    this.mProgressResult.b();
                    this.mProgressResult.a("bytesTotal", Long.toString(WVInteractsdkUpload.access$200(WVInteractsdkUpload.this)));
                    synchronized (WVInteractsdkUpload.access$300(WVInteractsdkUpload.this)) {
                        jArr[this.index] = j;
                        long j3 = 0;
                        for (long j4 : jArr) {
                            j3 += j4;
                        }
                        this.mProgressResult.a("bytesWritten", Long.toString(j3));
                        WVInteractsdkUpload.access$100(WVInteractsdkUpload.this).fireEvent(WVInteractsdkUpload.UPLOAD_PROGRESS_EVENT_NAME, this.mProgressResult.d());
                    }
                }

                @Override // com.taobao.interact.upload.service.FileUploadBaseListener
                public void onFinish(String str2, String str3) throws RemoteException {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt("resourceURL", str3);
                        jSONObject.putOpt(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, str2);
                        c.a a2 = com.taobao.interact.publish.service.c.a(str2);
                        jSONObject.putOpt("width", Integer.valueOf(a2.f17619a));
                        jSONObject.putOpt("height", Integer.valueOf(a2.b));
                        if (jSONArray2 != null && jSONArray2.length() != 0) {
                            jSONObject.putOpt("url", jSONArray2.optString(this.index));
                        }
                        if (jSONArray3 != null && jSONArray3.length() != 0) {
                            jSONObject.putOpt("watermarks", jSONArray3.optJSONArray(this.index));
                        }
                        WVInteractsdkUpload.access$100(WVInteractsdkUpload.this).fireEvent(WVInteractsdkUpload.UPLOAD_SUCCESS_EVENT_NAME, jSONObject.toString());
                        synchronized (this) {
                            try {
                                WVInteractsdkUpload.access$408(WVInteractsdkUpload.this);
                                WVInteractsdkUpload.access$500(WVInteractsdkUpload.this).put(this.index, jSONObject);
                                if (WVInteractsdkUpload.access$400(WVInteractsdkUpload.this) == length) {
                                    r rVar = new r();
                                    rVar.b();
                                    rVar.a("images", WVInteractsdkUpload.access$500(WVInteractsdkUpload.this));
                                    WVInteractsdkUpload.access$100(WVInteractsdkUpload.this).success(rVar);
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                                WVInteractsdkUpload.access$100(WVInteractsdkUpload.this).error(e.getMessage());
                            }
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        WVInteractsdkUpload.access$100(WVInteractsdkUpload.this).error(e2.getMessage());
                    }
                }

                @Override // com.taobao.interact.upload.service.FileUploadBaseListener
                public void onError(String str2, String str3, String str4) throws RemoteException {
                    r rVar = new r();
                    rVar.b();
                    rVar.a("errorType", str2);
                    rVar.a("errorCode", str3);
                    rVar.a("errorMsg", str4);
                    WVInteractsdkUpload.access$100(WVInteractsdkUpload.this).fireEvent(WVInteractsdkUpload.UPLOAD_FAILED_EVENT_NAME, rVar.d());
                    wVCallBackContext.error(rVar);
                }
            });
            i2++;
            wVInteractsdkUpload = this;
            jSONArray = jSONArray;
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        init(context);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e7f251", new Object[]{this, context, iWVWebView, obj});
            return;
        }
        super.initialize(context, iWVWebView, obj);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            this.mIUpload = new com.taobao.interact.upload.service.d(context);
        }
    }
}
