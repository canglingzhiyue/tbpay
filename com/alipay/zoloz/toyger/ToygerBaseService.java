package com.alipay.zoloz.toyger;

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.util.Log;
import com.alipay.zoloz.toyger.ToygerAlgorithmConfig;
import com.alipay.zoloz.toyger.ToygerAttr;
import com.alipay.zoloz.toyger.ToygerBiometricInfo;
import com.alipay.zoloz.toyger.ToygerCallback;
import com.alipay.zoloz.toyger.ToygerState;
import com.alipay.zoloz.toyger.algorithm.IToygerDelegate;
import com.alipay.zoloz.toyger.algorithm.TGDepthFrame;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class ToygerBaseService<C extends ToygerCallback, State extends ToygerState, Attr extends ToygerAttr, Info extends ToygerBiometricInfo, AlgorithmConfig extends ToygerAlgorithmConfig> implements IToygerDelegate<State, Attr, Info> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASSET_DOC = "toyger.doc.dat";
    public static final String ASSET_FACE = "toyger.face.dat";
    public static final String ASSET_FACE_DRAGONFLY = "toyger.face.dragonfly.dat";
    public static final String ASSET_FACE_DRAGONFLY_BETA = "toyger.face.dragonfly.beta.dat";
    public static final String ASSET_FACE_XNN_DRAGONFLY = "toyger.liveness.xnn.dat";
    public static final String ASSET_LICENSE = "toyger.license";
    public static final String KEY_ALGORITHM_CONFIG = "algorithmConfig";
    public static final String KEY_ASYNC_BLOB = "AsyncBlob";
    public static final String KEY_CAMERA_CONFIG = "camera_config";
    public static final String KEY_COMPLETE_BLOB = "CompleteBlob";
    public static final String KEY_DOC_FRAME_RECT = "docFrameRect";
    public static final String KEY_ENABLE_ENCUP = "enableEncUp";
    public static final String KEY_GrayModel_BasePath = "grayModelBasePath";
    public static final String KEY_GrayModel_Detect = "grayModelDetect";
    public static final String KEY_GrayModel_Liveness = "grayModelLiveness";
    public static final String KEY_IFFA_MSG = "IFFAMsg";
    public static final String KEY_IS_MIRROR = "is_mirror";
    public static final String KEY_LOCAL_MATCHING_COMMAND = "LocalMatchingCommand";
    public static final String KEY_META_SERIALIZER = "meta_serializer";
    public static final String KEY_NINE_SHOT_BLOB = "NineShootBlob";
    public static final String KEY_PUBLIC_KEY = "pubkey";
    public static final String KEY_RES_9_CONTENT = "content";
    public static final String KEY_RES_9_IS_UTF8 = "isUTF8";
    public static final String KEY_RES_9_KEY = "key";
    public static final String KEY_ROTATE_TIMES = "rotateTimes";
    public static final String KEY_TOKEN = "TOKEN";
    public static final String KEY_UPLOAD_CONFIG = "uploadConfig";
    public static final String KEY_USER_ID = "USER_ID";
    public static final String P_TAG_ANDROID = "TOYGER_FLOW_ANDROID";
    public static final String P_TAG_NATIVE = "TOYGER_FLOW_NATIVE";
    public static final String TAG = "TOYGER_FLOW_ANDROID";
    public static final String TAG_NATIVE = "TOYGER_FLOW_NATIVE";

    /* renamed from: a  reason: collision with root package name */
    public volatile C f6264a;

    public static boolean preLoad(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb05379c", new Object[]{context})).booleanValue();
        }
        return false;
    }

    public abstract boolean config(Map<String, Object> map);

    @Override // com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public abstract void handleCaptureCompleted(int i, List<Info> list, Map<String, Object> map);

    @Override // com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public abstract void handleInfoReady(TGFrame tGFrame, Attr attr);

    @Override // com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public abstract void handleLog(int i, HashMap<String, Object> hashMap);

    @Override // com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public abstract boolean handleModelLoad(int i);

    @Override // com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public abstract void handleScanCompleted(int i, List<Info> list, Map<String, Object> map);

    @Override // com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public abstract void handleStateUpdated(State state, Attr attr);

    public abstract boolean init(Context context, C c, String str, String str2, Map<String, Object> map);

    public abstract boolean init(Context context, boolean z, C c);

    public abstract boolean processImage(List<TGFrame> list, TGDepthFrame tGDepthFrame);

    public abstract void release(Handler handler);

    public abstract void reset();

    @Override // com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public PointF handleAlignDepthPoint(PointF pointF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("981936ed", new Object[]{this, pointF});
        }
        PointF pointF2 = new PointF();
        try {
            return this.f6264a != null ? this.f6264a.onAlignDepthPoint(pointF) : pointF2;
        } catch (NullPointerException e) {
            Log.e("TOYGER_FLOW_ANDROID", "handleAlignDepthPoint_NullPointer:" + e.toString());
            return pointF2;
        }
    }

    @Override // com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleEventTriggered(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca142d61", new Object[]{this, new Integer(i), str});
            return;
        }
        String str2 = "handleEventTriggered() eventCode=" + i + ", message=" + str;
        HashMap hashMap = null;
        if (i == -16 || i == -15) {
            hashMap = new HashMap();
            if (str != null) {
                hashMap.put(ToygerFaceAlgorithmConfig.DRAGONFLY_LIVENESS, str);
            } else {
                hashMap.put(ToygerFaceAlgorithmConfig.DRAGONFLY_LIVENESS, "-1");
            }
        }
        try {
            if (this.f6264a == null) {
                return;
            }
            this.f6264a.onEvent(i, hashMap);
        } catch (NullPointerException e) {
            Log.e("TOYGER_FLOW_ANDROID", "handleEventTriggered_NullPointer:" + e.toString());
        }
    }
}
