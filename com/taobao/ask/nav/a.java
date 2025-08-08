package com.taobao.ask.nav;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ask.ASK_CONST;
import com.taobao.ask.c;
import com.taobao.ask.utils.f;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RemoteBusiness f16392a = null;
    private c.C0633c b = null;

    static {
        kge.a(-1892782397);
    }

    public static /* synthetic */ RemoteBusiness a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteBusiness) ipChange.ipc$dispatch("d68cec0b", new Object[]{aVar}) : aVar.f16392a;
    }

    public static /* synthetic */ void a(Context context, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
        } else {
            e(context, map);
        }
    }

    public static /* synthetic */ c.C0633c b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.C0633c) ipChange.ipc$dispatch("e77c7160", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ void b(Context context, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2893eda6", new Object[]{context, map});
        } else {
            c(context, map);
        }
    }

    public final void a(final Context context, Uri uri, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd813be", new Object[]{this, context, uri, map});
            return;
        }
        String str = map.get("sessionId");
        if (StringUtils.isEmpty(str)) {
            str = String.valueOf(System.currentTimeMillis());
            map.put("sessionId", str);
        }
        final String str2 = str;
        String str3 = map.get("scene");
        boolean a2 = com.taobao.ask.utils.d.a((Object) map.get(ASK_CONST.KEY_CALL_FROM_WINDVANE), false);
        final String str4 = map.get(ASK_CONST.KEY_QUESTION_ID);
        boolean a3 = com.taobao.ask.utils.d.a((Object) map.get(ASK_CONST.KEY_DEGRADE_WHEN_ANSWERD), true);
        if (StringUtils.isEmpty(str4)) {
            com.taobao.social.sdk.jsbridge.a.callback(str2, false, false, ASK_CONST.ERROR.INVALID_PARAMS.toJSONObject());
            com.taobao.vividsocial.utils.a.a("TBAskEveryonePublisherOpenFailed", ASK_CONST.ERROR.INVALID_PARAMS.toJSONObject());
            TLog.loge(ASK_CONST.LOG_TAG, "answer publish open failed , questionId is null");
        } else if (d.a("answer", str3)) {
            if (a2 || !a3 || !d.b()) {
                z = false;
            }
            if (!z) {
                TLog.loge(ASK_CONST.LOG_TAG, "don't need check answerd , goNewPublish");
                c(context, map);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(ASK_CONST.KEY_QUESTION_ID, str4);
            this.b = com.taobao.ask.c.a(context, new c.a() { // from class: com.taobao.ask.nav.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.ask.c.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (a.a(a.this) == null) {
                    } else {
                        a.a(a.this).cancelRequest();
                    }
                }
            });
            this.f16392a = com.taobao.ask.utils.f.b("mtop.alibaba.ugc.ask.recommend.invite.question.get", null, hashMap, new f.a() { // from class: com.taobao.ask.nav.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.ask.utils.f.a
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        return;
                    }
                    if (a.b(a.this) != null) {
                        a.b(a.this).b();
                    }
                    JSONObject jSONObject2 = null;
                    if (jSONObject.containsKey("data")) {
                        jSONObject2 = jSONObject.getJSONObject("data");
                    }
                    try {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("invite");
                        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                            if (jSONObject3.containsKey("answer") && !jSONObject3.getJSONObject("answer").isEmpty()) {
                                String string = jSONObject3.getJSONObject("answer").getString("id");
                                if (!StringUtils.isEmpty(string)) {
                                    map.put("answerId", string);
                                    map.put("firstAnswerId", string);
                                }
                                map.put("id", str4);
                                a.a(context, map);
                                com.taobao.social.sdk.jsbridge.a.callback(str2, false, false, ASK_CONST.ERROR.PUBLISHER_DEGRADED.toJSONObject());
                                TLog.loge(ASK_CONST.LOG_TAG, "check answered:have answerd , goAnsweredPage");
                                return;
                            }
                            map.put(ASK_CONST.KEY_CACHE_DATA_ID, com.taobao.ask.b.a().a(jSONObject2));
                            a.b(context, map);
                            TLog.loge(ASK_CONST.LOG_TAG, "check answered:not have answerd , goNewPublish");
                            return;
                        }
                        com.taobao.social.sdk.jsbridge.a.callback(str2, false, false, ASK_CONST.ERROR.INVALID_PARAMS.toJSONObject());
                        com.taobao.vividsocial.utils.a.a("TBAskEveryonePublisherOpenFailed", ASK_CONST.ERROR.INVALID_PARAMS.toJSONObject());
                        Toast.makeText(context, "问题不见啦", 0).show();
                        TLog.loge(ASK_CONST.LOG_TAG, "check answered:,invite is null");
                    } catch (Exception e) {
                        map.put(ASK_CONST.KEY_CACHE_DATA_ID, com.taobao.ask.b.a().a(jSONObject2));
                        a.b(context, map);
                        TLog.loge(ASK_CONST.LOG_TAG, "check answered:have exception , goNewPublish " + e.getMessage());
                    }
                }

                @Override // com.taobao.ask.utils.f.a
                public void a(String str5, String str6) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str5, str6});
                        return;
                    }
                    if (a.b(a.this) != null) {
                        a.b(a.this).b();
                    }
                    com.taobao.social.sdk.jsbridge.a.callback(str2, false, false, ASK_CONST.ERROR.INVALID_PARAMS.toJSONObject());
                    com.taobao.vividsocial.utils.a.a("TBAskEveryonePublisherOpenFailed", ASK_CONST.ERROR.INVALID_PARAMS.toJSONObject());
                    Toast.makeText(context, StringUtils.isEmpty(str6) ? "打开失败,请稍后重试" : str6, 0).show();
                    TLog.loge(ASK_CONST.LOG_TAG, "check answered:,mtop error " + str5 + "," + str6);
                }
            });
        } else {
            TLog.loge(ASK_CONST.LOG_TAG, "open failed , answer publish is not enale");
            if (a2) {
                com.taobao.social.sdk.jsbridge.a.callback(str2, false, false, ASK_CONST.ERROR.PUBLISHER_DEGRADED.toJSONObject());
                com.taobao.vividsocial.utils.a.a("TBAskEveryonePublisherOpenFailed", ASK_CONST.ERROR.PUBLISHER_DEGRADED.toJSONObject());
                return;
            }
            d(context, map);
        }
    }

    private static void c(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c334b027", new Object[]{context, map});
            return;
        }
        com.taobao.ask.utils.d.a(map, ASK_CONST.KEY_TNODE_TIME, String.valueOf(System.nanoTime()));
        String str = map.get("openMode");
        if (!"present".equals(str) && !"push".equals(str)) {
            map.put("openMode", "push");
        }
        com.taobao.vividsocial.utils.a.a("TBAskEveryonePublisherWillOpen", null);
        com.taobao.ask.utils.d.a(context, ASK_CONST.PUBLISH_PRIVATE_URL, map);
        TLog.loge(ASK_CONST.LOG_TAG, "open new answer publish using activity");
    }

    private static void d(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd572a8", new Object[]{context, map});
        } else {
            com.taobao.ask.utils.d.a(context, com.taobao.ask.utils.c.a(ASK_CONST.ANSWER_PUBLISH_DEGRADE_URL_KEY, ASK_CONST.ANSWER_PUBLISH_DEGRADE_URL_DEFAULT_VALUE), map);
        }
    }

    private static void e(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8763529", new Object[]{context, map});
        } else {
            com.taobao.ask.utils.d.a(context, com.taobao.ask.utils.c.a(ASK_CONST.ANSWERED_URL_KEY, ASK_CONST.ANSWERED_URL_DEFAULT_VALUE), map);
        }
    }
}
