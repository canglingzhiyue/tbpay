package com.alibaba.security.wukong.pipe;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.security.ccrc.common.keep.IKeep;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alibaba.security.ccrc.service.build.Kb;
import com.alibaba.security.ccrc.service.build.Mb;
import com.alibaba.security.ccrc.service.build.Ob;
import com.alibaba.security.ccrc.service.build.Pb;
import com.alibaba.security.client.smart.core.core.WuKongNativeManager;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class RiskDataPipeManager implements IKeep, Mb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE_PIPE_EXCEPTION = "-1";
    public static final String DUPLICATE_PIPE_REGISTER = "2";
    public static final int PIPE_RESET = 70167;
    public static final String PIPE_RESULT_ERROR_CODE_KEY = "ec";
    public static final String PIPE_RESULT_ERROR_MSG_KEY = "em";
    public static final String PIPE_RESULT_STATUS_KEY = "e";
    public static final int PIPE_STATUS_DISABLE = 1;
    public static final int PIPE_STATUS_INIT = 0;
    public static final int PIPE_STATUS_REGISTERED = 2;
    public static final int PIPE_STATUS_REGISTER_FAILED = 3;
    public static final int PIPE_UNREGISTER = 70163;
    public static final String TAG = "RiskDataPipeManager";
    public final String mCcrcCode;
    public volatile int mCurrentPipeStatus = 0;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final String f3627a = "0";
        public static final String b = "1";
        public String c = "0";
        public String d;
        public String e;
        public String f;
    }

    public RiskDataPipeManager(String str) {
        this.mCcrcCode = str;
    }

    public static a getCallbackResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a5df77f4", new Object[]{str});
        }
        String[] split = str.split("_");
        a aVar = new a();
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i])) {
                if (i == 0) {
                    aVar.c = split[i];
                } else if (i == 1) {
                    aVar.d = split[i];
                } else if (i == 2) {
                    aVar.e = split[i];
                } else if (i == 3) {
                    aVar.f = split[i];
                }
            }
        }
        return aVar;
    }

    public static String getPipeOperation(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3dda2027", new Object[]{new Integer(i)}) : i == 70163 ? Ba.a.x : Ba.a.y;
    }

    public static boolean isDuplicatePipeRegister(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cf2ef127", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && "2".equals(str);
    }

    public static void onPipeRegistered(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fddb7e0", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a callbackResult = getCallbackResult(str);
            trackPipeCallback("1".equals(callbackResult.c) ? Ba.a.t : Ba.a.u, callbackResult, Ob.a().a(callbackResult.d, callbackResult.e));
            if (!"1".equals(callbackResult.c)) {
                return;
            }
            Ob.a().b(callbackResult.d, callbackResult.e);
        }
    }

    private Pair<String, String> parseError(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("919eeda1", new Object[]{this, hashMap});
        }
        return new Pair<>(hashMap.containsKey(PIPE_RESULT_ERROR_CODE_KEY) ? String.valueOf(hashMap.get(PIPE_RESULT_ERROR_CODE_KEY)) : "-1", hashMap.containsKey("em") ? String.valueOf(hashMap.get("em")) : "default msg");
    }

    public static void trackPipeCallback(String str, a aVar, Pb pb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d06ba8", new Object[]{str, aVar, pb});
        } else if (pb == null) {
        } else {
            TrackLog.Builder addParam = TrackLog.newBuilder().setpId(pb.b).setMetaId(pb.h).setSampleId(pb.g).setCcrcCode(pb.f3268a).setPhase("detect").setOperation(str).setStatus(0).addParam("eventId", pb.f);
            String str2 = "";
            TrackLog.Builder addParam2 = addParam.addParam("traceId", aVar == null ? str2 : aVar.f).addParam(com.taobao.tao.powermsg.model.a.COL_TASK, aVar == null ? str2 : aVar.e);
            if (aVar != null) {
                str2 = aVar.d;
            }
            TrackManager.track(addParam2.addParam("bizId", str2).build());
        }
    }

    private void trackPipeException(Pb pb, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d38696d", new Object[]{this, pb, str, str2, str3});
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(pb.b).setCcrcCode(this.mCcrcCode).setPhase("error").setOperation(str3).setStatus(-1).addParam("sgCode", str).addParam("errorMsg", str2).build());
        }
    }

    private void trackPipeRegister(int i, Pb pb, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bceadda6", new Object[]{this, new Integer(i), pb, str, str2});
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(pb.b).setCcrcCode(this.mCcrcCode).setPhase("init").setOperation(Ba.a.v).setStatus(i).addParam("sgCode", str).addParam("errorMsg", str2).addParam("bizId", Integer.valueOf(pb.c)).build());
        }
    }

    private void trackPipeWrite(int i, Pb pb, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("784d890", new Object[]{this, new Integer(i), pb, str, str2, str3, str4});
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(pb.b).setCcrcCode(this.mCcrcCode).setPhase("detect").setOperation(Ba.a.w).setStatus(i).addParam("sgCode", str).addParam("errorMsg", str2).addParam("bizId", Integer.valueOf(pb.c)).addParam("riskData", str3).addParam(com.taobao.tao.powermsg.model.a.COL_TASK, str4).addParam("pipeStatus", Integer.valueOf(this.mCurrentPipeStatus)).build());
        }
    }

    private boolean unregisterOrResetPipe(Pb pb, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a44788b0", new Object[]{this, pb, new Integer(i)})).booleanValue();
        }
        if (!Kb.b().a() || this.mCurrentPipeStatus != 2) {
            return false;
        }
        HashMap<String, Object> a2 = WuKongNativeManager.a().a(pb.c, i);
        if (a2 != null && !a2.isEmpty()) {
            try {
                Object obj = a2.get("e");
                if (obj != null && ((Integer) obj).intValue() == 0) {
                    return true;
                }
                Pair<String, String> parseError = parseError(a2);
                trackPipeException(pb, (String) parseError.first, (String) parseError.second, getPipeOperation(i));
                return false;
            } catch (Throwable th) {
                trackPipeException(pb, "-1", th.getMessage(), getPipeOperation(i));
                return false;
            }
        }
        trackPipeException(pb, "-1", "Null unregister result found", getPipeOperation(i));
        return false;
    }

    @Override // com.alibaba.security.ccrc.service.build.Mb
    public void registerPipe(Pb pb) {
        ArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3cef0a", new Object[]{this, pb});
        } else if (!Kb.b().a()) {
            this.mCurrentPipeStatus = 1;
        } else if (pb != null && (arrayList = pb.d) != null && !arrayList.isEmpty()) {
            if (this.mCurrentPipeStatus == 2) {
                return;
            }
            HashMap<String, Object> a2 = WuKongNativeManager.a().a(pb.c, pb.d);
            if (a2 != null && !a2.isEmpty()) {
                try {
                    Object obj = a2.get("e");
                    if (obj != null && ((Integer) obj).intValue() == 0) {
                        this.mCurrentPipeStatus = 2;
                        trackPipeRegister(0, pb, "0", "");
                        return;
                    }
                    Pair<String, String> parseError = parseError(a2);
                    if (isDuplicatePipeRegister((String) parseError.first)) {
                        trackPipeRegister(0, pb, (String) parseError.first, (String) parseError.second);
                        this.mCurrentPipeStatus = 2;
                        return;
                    }
                    this.mCurrentPipeStatus = 3;
                    trackPipeRegister(-1, pb, (String) parseError.first, (String) parseError.second);
                    return;
                } catch (Throwable th) {
                    this.mCurrentPipeStatus = 3;
                    trackPipeRegister(-1, pb, "-1", th.getMessage());
                    return;
                }
            }
            trackPipeRegister(-1, pb, "-1", "Null pipe register result found");
        } else {
            this.mCurrentPipeStatus = 1;
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.Mb
    public void resetPipeData(Pb pb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a06f100", new Object[]{this, pb});
        } else {
            unregisterOrResetPipe(pb, PIPE_RESET);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.Mb
    public void unregisterPipe(Pb pb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7950ea23", new Object[]{this, pb});
        } else if (!unregisterOrResetPipe(pb, PIPE_UNREGISTER)) {
        } else {
            this.mCurrentPipeStatus = 0;
            Ob.a().a(String.valueOf(pb.c));
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.Mb
    public void writeData(Pb pb, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e6958c", new Object[]{this, pb, str});
        } else if (!Kb.b().a() || this.mCurrentPipeStatus == 0 || this.mCurrentPipeStatus == 1) {
        } else {
            if (this.mCurrentPipeStatus != 3 && str != null) {
                HashMap<String, Object> a2 = WuKongNativeManager.a().a(pb.c, str);
                if (a2 != null && !a2.isEmpty()) {
                    try {
                        Object obj = a2.get("e");
                        if (obj != null && ((Integer) obj).intValue() == 0) {
                            int intValue = ((Integer) a2.get("t")).intValue();
                            Ob.a().a(String.valueOf(pb.c), String.valueOf(intValue), pb);
                            trackPipeWrite(0, pb, "0", "SUCCESS", str, String.valueOf(intValue));
                            return;
                        }
                        Pair<String, String> parseError = parseError(a2);
                        String str2 = (String) parseError.first;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Pipe writing failed with error: ");
                        sb.append((String) parseError.second);
                        trackPipeWrite(-1, pb, str2, sb.toString(), str, "");
                        return;
                    } catch (Throwable th) {
                        trackPipeWrite(-1, pb, "-1", th.getMessage(), str, "");
                        return;
                    }
                }
                trackPipeWrite(-1, pb, "-1", "Pipe writing failed with null result", str, "");
                return;
            }
            trackPipeWrite(-1, pb, "-1", "Pipe register failed ", str, "");
        }
    }
}
