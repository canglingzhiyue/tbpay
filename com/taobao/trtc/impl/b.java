package com.taobao.trtc.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcCallInterface;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.impl.TrtcInnerDefines;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-459565618);
    }

    public static /* synthetic */ void a(ArrayList arrayList, String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3199c284", new Object[]{arrayList, str, trtcUserRole, str2, str3});
        } else {
            b(arrayList, str, trtcUserRole, str2, str3);
        }
    }

    private static String a(ArrayList<TrtcInnerDefines.TrtcCallUserInfo> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5852829e", new Object[]{arrayList});
        }
        StringBuilder sb = new StringBuilder();
        Iterator<TrtcInnerDefines.TrtcCallUserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            TrtcInnerDefines.TrtcCallUserInfo next = it.next();
            sb.append("|");
            if (next.userId != null && !next.userId.isEmpty()) {
                sb.append(" userId: ");
                sb.append(next.userId);
            }
            sb.append(" role: ");
            sb.append(next.role);
            if (next.deviceId != null && !next.deviceId.isEmpty()) {
                sb.append(" device id: ");
                sb.append(next.deviceId);
            }
            if (next.extension != null && !next.extension.isEmpty()) {
                sb.append(" extension: ");
                sb.append(next.extension);
            }
            if (next.customInfo != null && !next.customInfo.isEmpty()) {
                sb.append(" custom info: ");
                sb.append(next.customInfo.toString());
            }
            sb.append(" |");
        }
        return sb.toString();
    }

    public static String a(TrtcInnerDefines.TrtcMakeCallParams trtcMakeCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c354e67d", new Object[]{trtcMakeCallParams});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append(a(trtcMakeCallParams.userInfos));
        sb.append(", timeout: ");
        sb.append(trtcMakeCallParams.callTimeout);
        String streamId = trtcMakeCallParams.inputStream != null ? trtcMakeCallParams.inputStream.streamId() : "null";
        sb.append(", input stream id: ");
        sb.append(streamId);
        sb.append(" } ");
        return sb.toString();
    }

    public static String a(TrtcInnerDefines.TrtcCancelCallParams trtcCancelCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac803949", new Object[]{trtcCancelCallParams});
        }
        return "{ " + a(trtcCancelCallParams.userInfos) + " } ";
    }

    public static String a(TrtcInnerDefines.TrtcAnswerCallParams trtcAnswerCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80f1bb8d", new Object[]{trtcAnswerCallParams});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{ remote user id: ");
        sb.append(trtcAnswerCallParams.remoteUserId);
        String streamId = trtcAnswerCallParams.inputStream != null ? trtcAnswerCallParams.inputStream.streamId() : "null";
        sb.append(", input stream id: ");
        sb.append(streamId);
        sb.append(", answer type: ");
        sb.append(TrtcDefines.TrtcAnswerType.values()[trtcAnswerCallParams.answerType]);
        sb.append(", extension: ");
        sb.append(trtcAnswerCallParams.extension);
        sb.append(" } ");
        return sb.toString();
    }

    public static String a(TrtcInnerDefines.TrtcHangUpCallParams trtcHangUpCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9ba663c", new Object[]{trtcHangUpCallParams});
        }
        return "{ " + a(trtcHangUpCallParams.userInfos) + " } ";
    }

    private static TrtcInnerDefines.TrtcCallUserInfo a(String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInnerDefines.TrtcCallUserInfo) ipChange.ipc$dispatch("747f6662", new Object[]{str, trtcUserRole, str2, str3});
        }
        TrtcInnerDefines.TrtcCallUserInfo trtcCallUserInfo = new TrtcInnerDefines.TrtcCallUserInfo();
        trtcCallUserInfo.customInfo = new HashMap();
        trtcCallUserInfo.extension = str3;
        trtcCallUserInfo.userId = str;
        trtcCallUserInfo.deviceId = str2;
        trtcCallUserInfo.role = trtcUserRole.ordinal();
        return trtcCallUserInfo;
    }

    private static void b(ArrayList<TrtcInnerDefines.TrtcCallUserInfo> arrayList, String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cbba23", new Object[]{arrayList, str, trtcUserRole, str2, str3});
        } else if (str == null) {
        } else {
            if (str2 == null) {
                str2 = "";
            }
            if (str3 == null) {
                str3 = "";
            }
            Iterator<TrtcInnerDefines.TrtcCallUserInfo> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                TrtcInnerDefines.TrtcCallUserInfo next = it.next();
                if (next.userId.equals(str)) {
                    next.deviceId = str2;
                    next.extension = str3;
                    next.role = trtcUserRole.ordinal();
                    break;
                }
            }
            if (z) {
                return;
            }
            arrayList.add(a(str, trtcUserRole, str2, str3));
        }
    }

    /* loaded from: classes9.dex */
    public static class d implements ITrtcCallInterface.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TrtcEngineImpl f23104a;
        public final TrtcInnerDefines.TrtcMakeCallParams b = new TrtcInnerDefines.TrtcMakeCallParams();

        static {
            kge.a(-575072273);
            kge.a(-1938414073);
        }

        public d(TrtcEngineImpl trtcEngineImpl) {
            this.f23104a = trtcEngineImpl;
            this.b.userInfos = new ArrayList<>();
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.d
        public ITrtcCallInterface.d a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.d) ipChange.ipc$dispatch("2a231810", new Object[]{this, new Boolean(z)});
            }
            this.b.isMultiChatMode = z;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.d
        public ITrtcCallInterface.d a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.d) ipChange.ipc$dispatch("387018c1", new Object[]{this, new Integer(i)});
            }
            this.b.maxChatUserNumber = i;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.d
        public ITrtcCallInterface.d b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.d) ipChange.ipc$dispatch("4aadb9e9", new Object[]{this, str});
            }
            this.b.subType = str;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.d
        public ITrtcCallInterface.d a(String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.d) ipChange.ipc$dispatch("caaf2392", new Object[]{this, str, trtcUserRole, str2, str3});
            }
            b.a(this.b.userInfos, str, trtcUserRole, str2, str3);
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.d
        public ITrtcCallInterface.d a(ITrtcInputStream iTrtcInputStream) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.d) ipChange.ipc$dispatch("a596b89d", new Object[]{this, iTrtcInputStream});
            }
            this.b.inputStream = iTrtcInputStream;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.d
        public ITrtcCallInterface.d a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.d) ipChange.ipc$dispatch("cc4cb60a", new Object[]{this, str});
            }
            TrtcInnerDefines.TrtcMakeCallParams trtcMakeCallParams = this.b;
            if (str == null) {
                str = "";
            }
            trtcMakeCallParams.extension = str;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.d
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            TrtcInnerDefines.TrtcMakeCallParams trtcMakeCallParams = this.b;
            trtcMakeCallParams.mediaConfig = TrtcEngineImpl.a(trtcMakeCallParams.inputStream);
            return this.f23104a.a(this.b);
        }
    }

    /* loaded from: classes9.dex */
    public static class a implements ITrtcCallInterface.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TrtcEngineImpl f23101a;
        public final TrtcInnerDefines.TrtcAnswerCallParams b = new TrtcInnerDefines.TrtcAnswerCallParams();

        static {
            kge.a(749206783);
            kge.a(-1918354153);
        }

        public a(TrtcEngineImpl trtcEngineImpl) {
            this.f23101a = trtcEngineImpl;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.a
        public ITrtcCallInterface.a a(TrtcDefines.TrtcAnswerType trtcAnswerType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.a) ipChange.ipc$dispatch("7fabd1ca", new Object[]{this, trtcAnswerType});
            }
            this.b.answerType = trtcAnswerType.ordinal();
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.a
        public ITrtcCallInterface.a a(ITrtcInputStream iTrtcInputStream) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.a) ipChange.ipc$dispatch("a596b840", new Object[]{this, iTrtcInputStream});
            }
            this.b.inputStream = iTrtcInputStream;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.a
        public ITrtcCallInterface.a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.a) ipChange.ipc$dispatch("2a2317b3", new Object[]{this, new Boolean(z)});
            }
            this.b.isMultiChatMode = z;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.a
        public ITrtcCallInterface.a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.a) ipChange.ipc$dispatch("cc4cb5ad", new Object[]{this, str});
            }
            this.b.subType = str;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.a
        public ITrtcCallInterface.a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.a) ipChange.ipc$dispatch("7399efa3", new Object[]{this, str, str2});
            }
            TrtcInnerDefines.TrtcAnswerCallParams trtcAnswerCallParams = this.b;
            trtcAnswerCallParams.remoteUserId = str;
            trtcAnswerCallParams.extension = str2;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.a
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            TrtcInnerDefines.TrtcAnswerCallParams trtcAnswerCallParams = this.b;
            trtcAnswerCallParams.mediaConfig = TrtcEngineImpl.a(trtcAnswerCallParams.inputStream);
            return this.f23101a.a(this.b);
        }
    }

    /* renamed from: com.taobao.trtc.impl.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C0991b implements ITrtcCallInterface.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TrtcEngineImpl f23102a;
        public final TrtcInnerDefines.TrtcCancelCallParams b = new TrtcInnerDefines.TrtcCancelCallParams();

        static {
            kge.a(-1848938565);
            kge.a(-989172269);
        }

        public C0991b(TrtcEngineImpl trtcEngineImpl) {
            this.f23102a = trtcEngineImpl;
            this.b.userInfos = new ArrayList<>();
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.b
        public ITrtcCallInterface.b a(String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.b) ipChange.ipc$dispatch("caaf2354", new Object[]{this, str, trtcUserRole, str2, str3});
            }
            b.a(this.b.userInfos, str, trtcUserRole, str2, str3);
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.b
        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f23102a.a(this.b);
        }
    }

    /* loaded from: classes9.dex */
    public static class c implements ITrtcCallInterface.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TrtcEngineImpl f23103a;
        public final TrtcInnerDefines.TrtcHangUpCallParams b = new TrtcInnerDefines.TrtcHangUpCallParams();

        static {
            kge.a(-463734578);
            kge.a(2040035430);
        }

        public c(TrtcEngineImpl trtcEngineImpl) {
            this.f23103a = trtcEngineImpl;
            this.b.userInfos = new ArrayList<>();
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.c
        public ITrtcCallInterface.c a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.c) ipChange.ipc$dispatch("cc4cb5eb", new Object[]{this, str});
            }
            b.a(this.b.userInfos, str, TrtcDefines.TrtcUserRole.E_ROLE_FANS_OR_CALL, "", "");
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.c
        public ITrtcCallInterface.c a(String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.c) ipChange.ipc$dispatch("caaf2373", new Object[]{this, str, trtcUserRole, str2, str3});
            }
            b.a(this.b.userInfos, str, trtcUserRole, str2, str3);
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.c
        public ITrtcCallInterface.c b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.c) ipChange.ipc$dispatch("4aadb9ca", new Object[]{this, str});
            }
            this.b.subType = str;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.c
        public ITrtcCallInterface.c a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.c) ipChange.ipc$dispatch("2a2317f1", new Object[]{this, new Boolean(z)});
            }
            this.b.isMultiChatMode = z;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.c
        public ITrtcCallInterface.c c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITrtcCallInterface.c) ipChange.ipc$dispatch("c90ebda9", new Object[]{this, str});
            }
            this.b.extension = str;
            return this;
        }

        @Override // com.taobao.trtc.api.ITrtcCallInterface.c
        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f23103a.a(this.b);
        }
    }
}
