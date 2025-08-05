package com.taobao.taolive.room.utils;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.liveurl.LiveUrlGetResponse;
import com.taobao.taolive.room.business.liveurl.LiveUrlGetResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.LiveSystemMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.playcontrol.d;
import com.taobao.taolive.sdk.ui.component.VideoFrame;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.util.ArrayList;
import org.json.JSONException;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.poy;

/* loaded from: classes8.dex */
public class x implements d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f21777a;
    private VideoFrame c;
    private VideoInfo d;
    private Activity f;
    private com.taobao.taolive.room.business.liveurl.a g;
    private boolean h;
    private com.taobao.alilive.aliliveframework.frame.a l;
    private int b = 0;
    private int e = 0;
    private String i = null;
    private String j = null;
    private String k = null;
    private com.taobao.taolive.sdk.ui.media.t m = new com.taobao.taolive.sdk.ui.media.t() { // from class: com.taobao.taolive.room.utils.x.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1754011296) {
                super.c((IMediaPlayer) objArr[0]);
                return null;
            } else if (hashCode != -1343767746) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Boolean(super.a((IMediaPlayer) objArr[0], ((Number) objArr[1]).longValue(), ((Number) objArr[2]).longValue(), objArr[3]));
            }
        }

        @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
        public boolean a(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6fb80ec2", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue() : x.this.a(iMediaPlayer, i, i2);
        }

        @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
        public boolean a(IMediaPlayer iMediaPlayer, long j, long j2, Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afe7bb3e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), obj})).booleanValue() : super.a(iMediaPlayer, j, j2, obj);
        }

        @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
        public void c(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9773e960", new Object[]{this, iMediaPlayer});
            } else {
                super.c(iMediaPlayer);
            }
        }
    };

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a a(x xVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("764afd54", new Object[]{xVar}) : xVar.l;
    }

    public static /* synthetic */ String a(x xVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c88f2297", new Object[]{xVar, str});
        }
        xVar.i = str;
        return str;
    }

    public static /* synthetic */ VideoFrame b(x xVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoFrame) ipChange.ipc$dispatch("89688f1", new Object[]{xVar}) : xVar.c;
    }

    public static /* synthetic */ String b(x xVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f9b0998", new Object[]{xVar, str});
        }
        xVar.j = str;
        return str;
    }

    public static /* synthetic */ String c(x xVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56a6f099", new Object[]{xVar, str});
        }
        xVar.k = str;
        return str;
    }

    static {
        kge.a(-1990592087);
        kge.a(-2101054629);
        f21777a = x.class.getSimpleName();
    }

    public x(VideoFrame videoFrame, Activity activity, boolean z, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.f = activity;
        this.c = videoFrame;
        VideoFrame videoFrame2 = this.c;
        if (videoFrame2 != null) {
            videoFrame2.setOnVideoStatusListener(this.m);
        }
        com.taobao.taolive.sdk.core.j.a(aVar, this, new MessageTypeFilter() { // from class: com.taobao.taolive.room.utils.x.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1024 || i == 1026 || i == 1017;
            }
        });
        this.l = aVar;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    private static ArrayList<QualitySelectItem> b(VideoInfo videoInfo, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("6794acdb", new Object[]{videoInfo, aVar});
        }
        if (poy.s(aVar) && videoInfo.tbtvLiveDO != null && videoInfo.tbtvLiveDO.liveUrlList != null) {
            return videoInfo.tbtvLiveDO.liveUrlList;
        }
        return videoInfo.liveUrlList;
    }

    public int a(VideoInfo videoInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7065e602", new Object[]{this, videoInfo, new Boolean(z)})).intValue();
        }
        if (videoInfo == null) {
            return -1;
        }
        return a(videoInfo, this.l);
    }

    public static int a(VideoInfo videoInfo, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c665f73", new Object[]{videoInfo, aVar})).intValue();
        }
        if (videoInfo == null) {
            return -1;
        }
        return a(b(videoInfo, aVar));
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("liveUrlList");
        ArrayList arrayList = new ArrayList();
        int size = jSONArray == null ? 0 : jSONArray.size();
        for (int i = 0; i < size; i++) {
            arrayList.add((QualitySelectItem) JSONObject.parseObject(jSONArray.getString(i), QualitySelectItem.class));
        }
        int a2 = a(arrayList);
        if (a2 >= 0) {
            return ((QualitySelectItem) arrayList.get(a2)).flvUrl;
        }
        Object obj = jSONObject.get("liveUrl");
        if (obj != null) {
            return (String) obj;
        }
        return null;
    }

    public static int a(ArrayList<QualitySelectItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfaf7e35", new Object[]{arrayList})).intValue();
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return -1;
        }
        if (arrayList.size() == 1) {
            return 0;
        }
        return arrayList.size() >= 2 ? 1 : -1;
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        String a2 = a(this.d, this.e);
        VideoFrame videoFrame = this.c;
        if (videoFrame != null) {
            videoFrame.playStreamUrl(a2, false, false, false, poy.s(this.l));
        }
        this.i = null;
        this.j = null;
        this.k = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
        if (r5.c.getMediaData().liveId.equals(tb.poy.u(r5.l).liveId) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.taobao.taolive.sdk.ui.media.IMediaPlayer r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.utils.x.a(com.taobao.taolive.sdk.ui.media.IMediaPlayer, int, int):boolean");
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        VideoInfo u = poy.u(this.l);
        if (u == null) {
            return;
        }
        if (this.g == null) {
            this.g = new com.taobao.taolive.room.business.liveurl.a(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.taolive.room.utils.x.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        onError(i, netResponse, obj);
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    } else if (!(netBaseOutDo instanceof LiveUrlGetResponse)) {
                    } else {
                        LiveUrlGetResponseData mo1437getData = ((LiveUrlGetResponse) netBaseOutDo).mo1437getData();
                        VideoInfo u2 = poy.u(x.a(x.this));
                        if (u2 == null || mo1437getData == null || mo1437getData.result == null || mo1437getData.result.size() <= 0) {
                            return;
                        }
                        u2.liveUrlList = mo1437getData.result;
                        x.a(x.this, (String) null);
                        x.b(x.this, (String) null);
                        x.c(x.this, null);
                        x xVar = x.this;
                        String a2 = xVar.a(u2, x.a(u2, x.a(xVar)));
                        if (x.b(x.this) == null) {
                            return;
                        }
                        x.b(x.this).playStreamUrl(a2, com.taobao.taolive.sdk.utils.u.D(), com.taobao.taolive.sdk.utils.u.E(), com.taobao.taolive.sdk.utils.u.F(), poy.s(x.a(x.this)));
                    }
                }
            });
        }
        this.g.a(u.liveId);
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : com.taobao.taolive.sdk.utils.u.D();
    }

    public String a(VideoInfo videoInfo, int i) {
        ArrayList<QualitySelectItem> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4369d222", new Object[]{this, videoInfo, new Integer(i)});
        }
        if (videoInfo == null || videoInfo.liveUrlList == null || videoInfo.liveUrlList.size() == 0) {
            return null;
        }
        this.d = videoInfo;
        this.e = i;
        if (i >= 0 && (b = b(videoInfo, this.l)) != null) {
            if (this.k == null && com.taobao.taolive.sdk.utils.u.F() && b.get(i).rtcLiveUrl != null) {
                this.k = b.get(i).rtcLiveUrl;
            }
            if (this.j == null && com.taobao.taolive.sdk.utils.u.E() && b.get(i).bfrtcUrl != null) {
                this.j = b.get(i).bfrtcUrl;
            }
            if (this.i == null && c() && b.get(i).artpUrl != null) {
                this.i = b.get(i).artpUrl;
                return this.i;
            }
            return b.get(i).flvUrl;
        }
        return videoInfo.liveUrl;
    }

    public String a(VideoInfo videoInfo, int i, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("773c4c39", new Object[]{this, videoInfo, new Integer(i), aVar});
        }
        ArrayList<QualitySelectItem> b = b(videoInfo, aVar);
        if (b != null && i >= 0 && i < b.size()) {
            return b.get(i).name;
        }
        return null;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.playcontrol.c.a(this.l, (d.a) null);
        com.taobao.taolive.sdk.core.j.a(this.l, this);
        com.taobao.taolive.room.business.liveurl.a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        LiveSystemMessage liveSystemMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            return;
        }
        pnj m = pmd.a().m();
        String str = f21777a;
        m.b(str, "onMessageReceived-----  test msgType = " + i);
        if (obj == null) {
            return;
        }
        if (i == 1024) {
            if (!"useH264".equals(((LiveSystemMessage) obj).type)) {
                return;
            }
            pmd.a().m().b(f21777a, "useH264");
            if (this.h) {
                return;
            }
            this.i = "DEFAULT";
            String a2 = a(this.d, this.e);
            this.i = null;
            this.j = null;
            this.k = null;
            VideoFrame videoFrame = this.c;
            if (videoFrame == null) {
                return;
            }
            videoFrame.playStreamUrl(a2, false, false, false, poy.s(this.l), -1, false);
        } else if (i == 1026) {
            try {
                String optString = new org.json.JSONObject((String) obj).optString("url");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                s.a(this.f, optString);
                this.f.finish();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (i != 1017 || (liveSystemMessage = (LiveSystemMessage) obj) == null || this.h) {
        } else {
            if (this.i != null) {
                if (!v.e(pmd.a().d().a("tblive", "supportArtpDowngradeFlv", "true"))) {
                    return;
                }
                a(0);
            } else if (this.c == null || !a(liveSystemMessage)) {
            } else {
                a(liveSystemMessage.playerQuality);
            }
        }
    }

    private boolean a(LiveSystemMessage liveSystemMessage) {
        int intValue;
        int intValue2;
        int intValue3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a3a3c26", new Object[]{this, liveSystemMessage})).booleanValue();
        }
        if (liveSystemMessage == null || TextUtils.isEmpty(liveSystemMessage.low) || TextUtils.isEmpty(liveSystemMessage.high) || !TextUtils.isDigitsOnly(liveSystemMessage.low) || !TextUtils.isDigitsOnly(liveSystemMessage.high) || pmd.a().q() == null) {
            return false;
        }
        String a2 = pmd.a().q().a();
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        try {
            intValue = Integer.valueOf(liveSystemMessage.low).intValue();
            intValue2 = Integer.valueOf(liveSystemMessage.high).intValue();
            if (a2.length() >= 2) {
                a2 = a2.substring(a2.length() - 2, a2.length());
            }
            intValue3 = Integer.valueOf(a2).intValue();
        } catch (Exception unused) {
        }
        return intValue <= intValue3 && intValue3 <= intValue2;
    }

    private void a(String str) {
        VideoFrame videoFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String b = b(str);
        if (TextUtils.isEmpty(b) || (videoFrame = this.c) == null) {
            return;
        }
        videoFrame.playStreamUrl(b, false, false, false, poy.s(this.l), v.b(str), true);
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int b = v.b(str);
        ArrayList<QualitySelectItem> b2 = b(this.d, this.l);
        if (b2 == null || b < 0 || b >= b2.size() || this.c == null) {
            return null;
        }
        this.e = b;
        String a2 = a(this.d, this.e);
        this.c.setVideoDefinition(a(this.d, this.e, this.l));
        return a2;
    }
}
