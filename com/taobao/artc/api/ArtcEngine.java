package com.taobao.artc.api;

import android.content.Context;
import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.common.inspector.DeviceInspector;
import com.taobao.common.inspector.d;
import com.taobao.trtc.adapter.TrtcAdapter;
import com.taobao.trtc.api.TrtcDefines;
import java.util.ArrayList;
import java.util.Map;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.artry.ArtryMessageInterface;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class ArtcEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ArtcEngine mInstance;

    @Deprecated
    public static boolean isHardwareVideoSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e81ee50", new Object[0])).booleanValue();
        }
        return true;
    }

    @Deprecated
    public abstract void answer(String str, String str2, String str3, int i, int i2) throws ArtcException;

    public abstract void answer2(String str, String str2, String str3, int i, int i2, boolean z, String str4, String str5) throws ArtcException;

    public abstract void answer2(String str, String str2, String str3, int i, int i2, boolean z, String str4, String str5, int i3, int i4) throws ArtcException;

    public abstract void answerMutli(String str, int i, String str2, boolean z, int i2, int i3, String str3);

    public abstract void answerNotifyChannel(String str, String str2, TrtcDefines.TrtcAnswerType trtcAnswerType, String str3);

    public void applayArtry(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d9b518", new Object[]{this, str});
        }
    }

    @Deprecated
    public abstract void call(String str, String str2, int i) throws ArtcException;

    public abstract void call2(String str, String str2, int i, int i2, String str3, String str4) throws ArtcException;

    public abstract void call2(String str, String str2, int i, int i2, String str3, String str4, int i3, int i4) throws ArtcException;

    public void callDevices(String str, ArrayList<ArtcPeerDeviceInfo> arrayList, int i, String str2, String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9248cd1d", new Object[]{this, str, arrayList, new Integer(i), str2, str3});
        }
    }

    public abstract void callMutli(ArrayList<String> arrayList, int i, String str, boolean z, int i2, int i3, int i4, String str2, String str3);

    public void callPstn(String str, String str2, String str3, String str4, int i, String str5, String str6) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50eb586d", new Object[]{this, str, str2, str3, str4, new Integer(i), str5, str6});
        }
    }

    @Deprecated
    public abstract void cancelCall(String str, String str2) throws ArtcException;

    public abstract void cancelCall2(String str, String str2, String str3, String str4) throws ArtcException;

    public void cancelCallDevices(String str, ArrayList<ArtcPeerDeviceInfo> arrayList, String str2, String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7c17e8", new Object[]{this, str, arrayList, str2, str3});
        }
    }

    public void cancelCallPstn(String str, String str2, String str3, String str4, String str5, String str6) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c24b918", new Object[]{this, str, str2, str3, str4, str5, str6});
        }
    }

    public abstract void cancelNotifyChannel(String str, String str2, String str3);

    public boolean checkCameraLight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("564476d4", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void clearArtry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddbe2ba4", new Object[]{this});
        }
    }

    public void clearupArtry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32292a9", new Object[]{this});
        }
    }

    public abstract void createChannel(String str) throws ArtcException;

    public abstract void createChannel2(String str, String str2) throws ArtcException;

    public abstract void customUTPerf(Map<String, String> map);

    public abstract void customUTTrace(String str);

    public void enableCameraLight(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("565a007f", new Object[]{this, new Boolean(z)});
        }
    }

    public void enableFaceBeauty(boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557b3d91", new Object[]{this, new Boolean(z)});
        }
    }

    public void enableFaceShape(boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("354dbecc", new Object[]{this, new Boolean(z)});
        }
    }

    public abstract void enableTorch(boolean z);

    public void encodeVideoCustomFrame(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ebb288", new Object[]{this, str});
        }
    }

    public int getCameraBrightness() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6da88746", new Object[]{this})).intValue();
        }
        return 0;
    }

    public String getCurrentAudioOutDevice() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17e11768", new Object[]{this});
        }
        return null;
    }

    public String getCurrentCameraName() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a48adfe6", new Object[]{this});
        }
        return null;
    }

    public abstract IArtcExternalVideoCapturer getExternalVideoCapture();

    public abstract IArtcExternalVideoRender getExternalVideoRender();

    public int getMicVolume() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21aca085", new Object[]{this})).intValue();
        }
        return 0;
    }

    public abstract String getUserId() throws ArtcException;

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : "";
    }

    public abstract void initConfig(ArtcConfig artcConfig) throws ArtcException;

    @Deprecated
    public abstract void initialize(ArtcConfig artcConfig) throws ArtcException;

    public abstract void initialize2(ArtcConfig artcConfig, String str) throws ArtcException;

    @Deprecated
    public abstract void invite(String str, String str2) throws ArtcException;

    public void invite2(String str, String str2, String str3, String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cf8a78", new Object[]{this, str, str2, str3, str4});
        }
    }

    @Deprecated
    public boolean isFaceBeautyAvailable() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44b3f991", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract boolean isFrontFacingCamera();

    public boolean isSpeakerphoneEnabled() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3514fe73", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isVideoHardwareEncoderRuning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e063c345", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract void joinCall(String str, boolean z, String str2, int i, int i2, String str3);

    @Deprecated
    public abstract void joinChannel(String str) throws ArtcException;

    public abstract void joinChannel2(String str, String str2, String str3) throws ArtcException;

    @Deprecated
    public abstract void kick(String str, String str2) throws ArtcException;

    public abstract void kick2(String str, String str2, String str3, String str4) throws ArtcException;

    public abstract void kickMutli(ArrayList<String> arrayList, String str, boolean z, String str2);

    @Deprecated
    public abstract void leaveChannel() throws ArtcException;

    public abstract void leaveChannel2(String str, String str2) throws ArtcException;

    public abstract void muteLocalAudioStream(boolean z) throws ArtcException;

    public abstract void muteLocalVideoStream(boolean z) throws ArtcException;

    public abstract void muteRemoteAudio(ArrayList<String> arrayList, boolean z, boolean z2);

    public abstract void muteRemoteAudioStream(boolean z) throws ArtcException;

    public abstract void muteRemoteAudioStream(boolean z, String str) throws ArtcException;

    public void muteRemoteVideoStream(boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e80e11", new Object[]{this, new Boolean(z)});
        }
    }

    public abstract void notifyChannel(String str, String str2, String str3, boolean z, boolean z2);

    public void registCameraCallback(IArtcCameraHandle iArtcCameraHandle) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357c58f5", new Object[]{this, iArtcCameraHandle});
        }
    }

    public void registLogCallback(IArtcLogHandle iArtcLogHandle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a626fb5", new Object[]{this, iArtcLogHandle});
        }
    }

    public abstract void registUser(String str) throws ArtcException;

    public abstract void registerAccsObserver(ArrayList<String> arrayList);

    public void registerArtryCallback(ArtryMessageInterface artryMessageInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308208a2", new Object[]{this, artryMessageInterface});
        }
    }

    public abstract void registerHandler(ArtcEngineEventHandler artcEngineEventHandler) throws ArtcException;

    @Deprecated
    public void registerHandler(IArtcEngineEventHandler iArtcEngineEventHandler) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3df2f9a9", new Object[]{this, iArtcEngineEventHandler});
        }
    }

    public void registerSignalChannelHandler(ArtcSignalChannelHandler artcSignalChannelHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("703f2308", new Object[]{this, artcSignalChannelHandler});
        }
    }

    public void registerSpeakerCallback(ArtcSpeakerHandle artcSpeakerHandle) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d19a43", new Object[]{this, artcSpeakerHandle});
        }
    }

    public abstract void sendChannelBroadcastMsg(String str, String str2, String str3);

    public abstract void sendCustomSei(String str, String str2, boolean z) throws ArtcException;

    public abstract void sendMessage(String str, String str2) throws ArtcException;

    public abstract void sendMessage(String str, String str2, String str3, String str4) throws ArtcException;

    public abstract void setAudioEventHandler(IAudioRecordEventHandler iAudioRecordEventHandler) throws ArtcException;

    public void setAudioOutputVolume(float f) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("975c9f4a", new Object[]{this, new Float(f)});
        }
    }

    public void setBackgroundView(SurfaceViewRenderer surfaceViewRenderer) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd4fead", new Object[]{this, surfaceViewRenderer});
        }
    }

    public void setBeautyParam2(float f, float f2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d816ea", new Object[]{this, new Float(f), new Float(f2)});
        }
    }

    public abstract void setBroadcast(String str) throws ArtcException;

    public void setCallTimeout(int i) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96fe949b", new Object[]{this, new Integer(i)});
        }
    }

    public void setCameraBrightness(int i) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177b8884", new Object[]{this, new Integer(i)});
        }
    }

    public abstract void setChannelProfile(AConstants.ArtcChannelProfile artcChannelProfile, boolean z) throws ArtcException;

    public abstract void setChannelProfile(AConstants.ArtcChannelProfile artcChannelProfile, boolean z, boolean z2) throws ArtcException;

    public void setDisplayPixel(int i, int i2, boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da051967", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        }
    }

    public abstract void setEnableSpeakerphone(boolean z) throws ArtcException;

    @Deprecated
    public void setFaceBeautyParam(float f, float f2, float f3, float f4, float f5, float f6, float f7) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e677007", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Float(f7)});
        }
    }

    public void setFaceParam(float f, float f2, float f3, float f4, float f5, float f6) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd578fb5", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6)});
        }
    }

    public void setLocalAEDEnable(boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f158bf33", new Object[]{this, new Boolean(z)});
        }
    }

    public abstract void setLocalVideoFreeze(TrtcDefines.q qVar);

    public abstract void setLocalView(SurfaceViewRenderer surfaceViewRenderer) throws ArtcException;

    public abstract void setRemoteVideoFreeze(ArrayList<TrtcDefines.p> arrayList);

    @Deprecated
    public abstract void setRemoteView(SurfaceViewRenderer surfaceViewRenderer) throws ArtcException;

    public abstract void setRemoteView(SurfaceViewRenderer surfaceViewRenderer, String str) throws ArtcException;

    public abstract void setTransportProfile(AConstants.ArtcMediaType artcMediaType, AConstants.ArtcTransportProfile artcTransportProfile) throws ArtcException;

    public abstract void setUserId(String str) throws ArtcException;

    public abstract void setVideoLayout(ArtcVideoLayout artcVideoLayout) throws ArtcException;

    public abstract void setVideoLayout(ArtcVideoLayout artcVideoLayout, boolean z) throws ArtcException;

    public void setVideoMinMaxBitrate(int i, int i2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa515649", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public abstract void setVideoMirror(boolean z) throws ArtcException;

    public abstract void setVideoMirror(boolean z, boolean z2) throws ArtcException;

    public abstract void setVideoProfile(AConstants.ArtcVideoProfile artcVideoProfile, boolean z) throws ArtcException;

    public void setVideoResolution(AConstants.ArtcVideoResolutionType artcVideoResolutionType, boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da06475", new Object[]{this, artcVideoResolutionType, new Boolean(z)});
        }
    }

    public void setVideoRotation(boolean z, int i) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca41c0d", new Object[]{this, new Boolean(z), new Integer(i)});
        }
    }

    public void setupArtry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2b95d74", new Object[]{this});
        }
    }

    public abstract void startLive(String str, String str2, String str3) throws ArtcException;

    public void startMediaRecordFromFile(String str, AConstants.ArtcMediaRecordType artcMediaRecordType, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d339bb9", new Object[]{this, str, artcMediaRecordType, str2});
        }
    }

    public void startMediaRecordToFile(String str, AConstants.ArtcMediaRecordType artcMediaRecordType, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f740f74a", new Object[]{this, str, artcMediaRecordType, str2});
        }
    }

    public abstract void startPreview() throws ArtcException;

    public abstract void startPreview2(String str) throws ArtcException;

    public abstract void stopLive() throws ArtcException;

    public void stopMediaRecordFromFile(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b18572a", new Object[]{this, str});
        }
    }

    public void stopMediaRecordToFile(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655937b", new Object[]{this, str});
        }
    }

    public abstract void stopPreview() throws ArtcException;

    public abstract void stopPreview2(String str) throws ArtcException;

    @Deprecated
    public void swapScreen() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c680e6", new Object[]{this});
        }
    }

    public abstract void switchCamera() throws ArtcException;

    public abstract void switchCamera(String str) throws ArtcException;

    @Deprecated
    public void switchMedia(String str, String str2, int i, int i2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c85ccb", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
        }
    }

    public Bitmap takeSnapshot() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ef386750", new Object[]{this});
        }
        return null;
    }

    public void turnOffLocalVideo(boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fec874b", new Object[]{this, new Boolean(z)});
        }
    }

    @Deprecated
    public abstract void unInitialize() throws ArtcException;

    public abstract void unInitialize2(String str) throws ArtcException;

    public abstract void unRegisterHandler() throws ArtcException;

    public abstract void unregistUser() throws ArtcException;

    static {
        kge.a(67401331);
        mInstance = null;
    }

    public static synchronized ArtcEngine create(Context context) throws ArtcException {
        synchronized (ArtcEngine.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArtcEngine) ipChange.ipc$dispatch("df63b72d", new Object[]{context});
            }
            if (mInstance == null) {
                mInstance = new TrtcAdapter(context, new DeviceInspector(context, new d(context).a().b().c()));
            }
            return mInstance;
        }
    }

    public static synchronized void destroy() throws ArtcException {
        synchronized (ArtcEngine.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[0]);
                return;
            }
            if (mInstance != null) {
                mInstance = null;
            }
        }
    }

    public String[] getCameraNames() throws ArtcException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("43429ec3", new Object[]{this}) : new String[0];
    }
}
