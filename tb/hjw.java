package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.nav.Nav;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.subscribe.SubscribeUtils;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;
import tb.hix;
import tb.pmd;

/* loaded from: classes6.dex */
public class hjw extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVEENDRECOMMENDACTION = 6354536541928441340L;

    /* renamed from: a  reason: collision with root package name */
    private a f28708a;
    private TBLiveDataModel b;

    static {
        kge.a(1825164828);
    }

    public static /* synthetic */ Object ipc$super(hjw hjwVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(hjw hjwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec19c303", new Object[]{hjwVar});
        } else {
            hjwVar.b();
        }
    }

    public hjw(a aVar, TBLiveDataModel tBLiveDataModel) {
        this.f28708a = aVar;
        this.b = tBLiveDataModel;
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr.length <= 0) {
        } else {
            String str = (String) objArr[0];
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -801419427) {
                if (hashCode != -84925846) {
                    if (hashCode == 1759834228 && str.equals("previewBtnClick")) {
                        c = 1;
                    }
                } else if (str.equals("gotoLiveRoom")) {
                    c = 0;
                }
            } else if (str.equals("followBtnClick")) {
                c = 2;
            }
            if (c == 0) {
                if (objArr.length <= 1) {
                    return;
                }
                String str2 = (String) objArr[1];
                HashMap hashMap = new HashMap();
                hashMap.put("jumpUrl", str2);
                if (phg.a() != null) {
                    phg.a().a(n.a(), "recommend-clk", (Map<String, String>) hashMap);
                }
                Nav.from(dXRuntimeContext.m()).toUri(str2);
            } else if (c == 1) {
                a(dXRuntimeContext);
            } else if (c != 2) {
            } else {
                final JSONObject e = dXRuntimeContext.e();
                final JSONObject jSONObject = (JSONObject) e.clone();
                if (!StringUtils.equals(e.getString(nmf.MTOP_ISFOLLOW), "false") || pmd.a().B() == null) {
                    return;
                }
                pmd.a().B().a(a(), new pmv() { // from class: tb.hjw.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.pmv
                    public void a(String str3, String str4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str3, str4});
                        }
                    }

                    @Override // tb.pmv
                    public void a(pmz pmzVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f9ec2b9b", new Object[]{this, pmzVar});
                            return;
                        }
                        jSONObject.put(nmf.MTOP_ISFOLLOW, (Object) "true");
                        if (dXRuntimeContext != null && e != null) {
                            f.m().renderDX(dXRuntimeContext.s(), jSONObject);
                        }
                        if (pmd.a() != null && pmd.a().u() != null) {
                            hix.a(pmd.a().u().c(), "关注成功");
                        }
                        HashMap hashMap2 = new HashMap();
                        if (phg.a() == null) {
                            return;
                        }
                        phg.a().a(n.a(), "attention-clk", (Map<String, String>) hashMap2);
                    }
                });
            }
        }
    }

    private void a(final DXRuntimeContext dXRuntimeContext) {
        final JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487cd5d9", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext == null || dXRuntimeContext.e() == null || (jSONObject = (JSONObject) dXRuntimeContext.e().clone()) == null) {
        } else {
            final boolean equals = StringUtils.equals("true", jSONObject.getString("isPreview"));
            String string = jSONObject.getString("preLiveId");
            if (phg.d().a()) {
                com.taobao.android.live.plugin.atype.flexalocal.subscribe.a.a(equals, string, "taoLiveStartNotify", null, "tblive_inline", new IObserverX() { // from class: com.taobao.android.live.plugin.atype.flexalocal.liveend.dxhandler.DXTaoLiveEndRecommendActionEventHandler$2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX
                    public void onNext(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b4b8495", new Object[]{this, obj});
                            return;
                        }
                        if (equals) {
                            jSONObject.put("isPreview", (Object) "false");
                        } else {
                            jSONObject.put("isPreview", (Object) "true");
                        }
                        if (!(obj instanceof SubScribeCenterResultDTO) || !"SUCCESS".equals(((SubScribeCenterResultDTO) obj).getRetCode()) || dXRuntimeContext == null || jSONObject == null) {
                            return;
                        }
                        f.m().renderDX(dXRuntimeContext.s(), jSONObject);
                    }

                    @Override // com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX
                    public void onError(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                        } else {
                            hix.a(pmd.a().u().c(), "预约失败");
                        }
                    }
                });
            } else if (!equals) {
                SubscribeUtils.INSTANCE.doSubscribe(string, "taoLiveStartNotify", null, "tblive_inline", new IObserver<SubScribeCenterResultDTO>() { // from class: tb.hjw.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public /* synthetic */ void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b4b8495", new Object[]{this, subScribeCenterResultDTO});
                        } else {
                            a(subScribeCenterResultDTO);
                        }
                    }

                    public void a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("962936cf", new Object[]{this, subScribeCenterResultDTO});
                            return;
                        }
                        jSONObject.put("isPreview", (Object) "true");
                        if (!(subScribeCenterResultDTO instanceof SubScribeCenterResultDTO) || !"SUCCESS".equals(subScribeCenterResultDTO.getRetCode()) || dXRuntimeContext == null || jSONObject == null) {
                            return;
                        }
                        f.m().renderDX(dXRuntimeContext.s(), jSONObject);
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onError(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                        } else {
                            hjw.a(hjw.this);
                        }
                    }
                });
            } else {
                SubscribeUtils.INSTANCE.cancelSubscribe(string, "taoLiveStartNotify", null, "tblive_inline", new IObserver<SubScribeCenterResultDTO>() { // from class: tb.hjw.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public /* synthetic */ void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b4b8495", new Object[]{this, subScribeCenterResultDTO});
                        } else {
                            a(subScribeCenterResultDTO);
                        }
                    }

                    public void a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("962936cf", new Object[]{this, subScribeCenterResultDTO});
                            return;
                        }
                        jSONObject.put("isPreview", (Object) "false");
                        if (!(subScribeCenterResultDTO instanceof SubScribeCenterResultDTO) || !"SUCCESS".equals(subScribeCenterResultDTO.getRetCode()) || dXRuntimeContext == null || jSONObject == null) {
                            return;
                        }
                        f.m().renderDX(dXRuntimeContext.s(), jSONObject);
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onError(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                        } else {
                            hjw.a(hjw.this);
                        }
                    }
                });
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            hix.a(pmd.a().u().c(), "预约失败");
        }
    }

    private pmt a() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pmt) ipChange.ipc$dispatch("f0935e7", new Object[]{this});
        }
        TBLiveDataModel tBLiveDataModel = this.b;
        if (tBLiveDataModel == null) {
            return new pmt();
        }
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (videoInfo == null) {
            return new pmt();
        }
        String str3 = "";
        if (videoInfo != null) {
            if (videoInfo.broadCaster != null) {
                str3 = videoInfo.broadCaster.accountId;
                str2 = videoInfo.broadCaster.type;
            } else {
                str2 = str3;
            }
            str = videoInfo.liveId;
        } else {
            str = str3;
            str2 = str;
        }
        if (StringUtils.isEmpty(str3) || StringUtils.isEmpty(str2)) {
            return new pmt();
        }
        pmt pmtVar = new pmt();
        pmtVar.c = str;
        pmtVar.b = str2;
        pmtVar.f32764a = str3;
        pmtVar.p = pmt.FOLLOW_COMMENT;
        return phg.a().a(pmtVar);
    }
}
