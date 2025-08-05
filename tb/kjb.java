package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zlz.toyger.zdoc.b;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.taobao.scancode.gateway.util.i;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u000fJ&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0002J4\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00172\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0002J.\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0002J \u0010\u001d\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006!"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserRateListDataParser;", "Lcom/taobao/android/dinamicx/expression/parser/DXAbsDinamicDataParser;", "()V", "RATE_LISTADAPTER_PHOTOBROWSER", "", "getRATE_LISTADAPTER_PHOTOBROWSER", "()Ljava/lang/String;", "setRATE_LISTADAPTER_PHOTOBROWSER", "(Ljava/lang/String;)V", "evalWithArgs", "", "operationList", "", "dinamicParams", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "([Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)Ljava/lang/Object;", "getBaseDataFrom", "Lcom/alibaba/fastjson/JSONObject;", "obj", "idx", "", "originalData", "getPictureArrayFrom", "Lcom/alibaba/fastjson/JSONArray;", "sourceData", "picList", "resultData", "getVideoJsonFrom", "videoInfo", "photoBrowserDataAdapter", b.INFO_PAGE_NUMBER, "pageSize", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class kjb extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private static final long b = -3446773587771465578L;

    /* renamed from: a  reason: collision with root package name */
    private String f30114a = i.SOURCE_TYPE_PHOTO;

    public static /* synthetic */ Object ipc$super(kjb kjbVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserRateListDataParser$Companion;", "", "()V", "DX_PARSER_RATELISTDATAADAPTER", "", "getDX_PARSER_RATELISTDATAADAPTER", "()J", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : kjb.a();
        }
    }

    public static final /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : b;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        Object obj = objArr[0];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
        }
        JSONArray jSONArray = (JSONArray) obj;
        Object obj2 = objArr[1];
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        String str = (String) obj2;
        Object obj3 = objArr[2];
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        int parseInt = Integer.parseInt((String) obj3);
        Object obj4 = objArr[3];
        if (obj4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        int parseInt2 = Integer.parseInt((String) obj4);
        if (!q.a((Object) str, (Object) this.f30114a)) {
            return null;
        }
        try {
            return a(jSONArray, parseInt, parseInt2);
        } catch (Exception unused) {
            return null;
        }
    }

    public final JSONArray a(JSONArray jSONArray, int i, int i2) {
        Object obj;
        int i3;
        String str;
        String str2;
        JSONArray jSONArray2;
        int i4;
        JSONArray sourceData = jSONArray;
        int i5 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("6224fa4e", new Object[]{this, sourceData, new Integer(i5), new Integer(i2)});
        }
        q.d(sourceData, "sourceData");
        JSONArray jSONArray3 = new JSONArray();
        int size = jSONArray.size();
        JSONArray jSONArray4 = jSONArray3;
        int i6 = 0;
        while (i6 < size) {
            JSONObject jSONObject = sourceData.getJSONObject(i6);
            if (jSONObject == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            int i7 = i6 + ((i5 - 1) * i2);
            if (jSONObject.get("video") != null) {
                Object obj2 = jSONObject.get("video");
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
                obj = "video";
                i3 = i7;
                str = "null cannot be cast to non-null type com.alibaba.fastjson.JSONObject";
                jSONArray4.add(a(this, jSONObject, (JSONObject) obj2, i7, null, 8, null));
            } else {
                obj = "video";
                i3 = i7;
                str = "null cannot be cast to non-null type com.alibaba.fastjson.JSONObject";
            }
            if (jSONObject.get("feedPicList") != null) {
                Object obj3 = jSONObject.get("feedPicList");
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
                }
                str2 = "null cannot be cast to non-null type com.alibaba.fastjson.JSONArray";
                jSONArray2 = a(this, jSONObject, (JSONArray) obj3, i3, jSONArray4, null, 16, null);
            } else {
                str2 = "null cannot be cast to non-null type com.alibaba.fastjson.JSONArray";
                jSONArray2 = jSONArray4;
            }
            if (jSONObject.get("appendedFeed") != null) {
                Object obj4 = jSONObject.get("appendedFeed");
                if (obj4 == null) {
                    throw new NullPointerException(str);
                }
                JSONObject jSONObject2 = (JSONObject) obj4;
                if (jSONObject2.get(obj) != null) {
                    Object obj5 = jSONObject2.get(obj);
                    if (obj5 == null) {
                        throw new NullPointerException(str);
                    }
                    i4 = i3;
                    jSONArray2.add(a(jSONObject2, (JSONObject) obj5, i4, jSONObject));
                } else {
                    i4 = i3;
                }
                if (jSONObject2.get("appendFeedPicList") != null) {
                    Object obj6 = jSONObject2.get("appendFeedPicList");
                    if (obj6 == null) {
                        throw new NullPointerException(str2);
                    }
                    jSONArray4 = a(jSONObject2, (JSONArray) obj6, i4, jSONArray2, jSONObject);
                    i6++;
                    sourceData = jSONArray;
                    i5 = i;
                }
            }
            jSONArray4 = jSONArray2;
            i6++;
            sourceData = jSONArray;
            i5 = i;
        }
        return jSONArray4;
    }

    public static /* synthetic */ JSONObject a(kjb kjbVar, JSONObject jSONObject, JSONObject jSONObject2, int i, JSONObject jSONObject3, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2a9e7b1d", new Object[]{kjbVar, jSONObject, jSONObject2, new Integer(i), jSONObject3, new Integer(i2), obj});
        }
        if ((i2 & 8) != 0) {
            jSONObject3 = null;
        }
        return kjbVar.a(jSONObject, jSONObject2, i, jSONObject3);
    }

    private final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, int i, JSONObject jSONObject3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f852c1d5", new Object[]{this, jSONObject, jSONObject2, new Integer(i), jSONObject3});
        }
        JSONObject jSONObject4 = new JSONObject();
        if (jSONObject2.get("videoId") == null || !q.a(jSONObject2.get("status"), (Object) "1")) {
            return null;
        }
        JSONObject jSONObject5 = jSONObject4;
        Object obj = jSONObject2.get("videoId");
        if (obj == null) {
            obj = "";
        }
        jSONObject5.put((JSONObject) "videoId", (String) obj);
        Object obj2 = jSONObject2.get("cloudVideoUrl");
        if (obj2 == null && (obj2 = jSONObject2.get("sourceVideoUrl")) == null) {
            obj2 = "";
        }
        jSONObject5.put((JSONObject) "videoUrl", (String) obj2);
        Object obj3 = jSONObject2.get("coverUrl");
        if (obj3 == null) {
            obj3 = "";
        }
        jSONObject5.put((JSONObject) eby.KEY_PIC_URL, (String) obj3);
        Object obj4 = jSONObject2.get("spmCnt");
        if (obj4 == null) {
            obj4 = RateFeedsFragment.Companion.b();
        }
        jSONObject5.put((JSONObject) "spmCnt", (String) obj4);
        jSONObject5.put((JSONObject) "bizCode", "baobeipingjia");
        if (jSONObject2.get("width") != null) {
            jSONObject5.put((JSONObject) "width", (String) jSONObject2.get("width"));
        }
        if (jSONObject2.get("height") != null) {
            jSONObject5.put((JSONObject) "height", (String) jSONObject2.get("height"));
        }
        JSONObject a2 = a(jSONObject, i, jSONObject3);
        if (a2 != null) {
            a2.put((JSONObject) "video", (String) jSONObject4);
        }
        return a2;
    }

    public static /* synthetic */ JSONArray a(kjb kjbVar, JSONObject jSONObject, JSONArray jSONArray, int i, JSONArray jSONArray2, JSONObject jSONObject2, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("3737d147", new Object[]{kjbVar, jSONObject, jSONArray, new Integer(i), jSONArray2, jSONObject2, new Integer(i2), obj});
        }
        if ((i2 & 16) != 0) {
            jSONObject2 = null;
        }
        return kjbVar.a(jSONObject, jSONArray, i, jSONArray2, jSONObject2);
    }

    private final JSONArray a(JSONObject jSONObject, JSONArray jSONArray, int i, JSONArray jSONArray2, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("681e4ac9", new Object[]{this, jSONObject, jSONArray, new Integer(i), jSONArray2, jSONObject2});
        }
        int size = jSONArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
            if (jSONObject3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            JSONObject jSONObject4 = new JSONObject();
            JSONObject jSONObject5 = jSONObject4;
            Object obj = jSONObject3.get("thumbnail");
            if (obj == null) {
                obj = "";
            }
            jSONObject5.put((JSONObject) eby.KEY_PIC_URL, (String) obj);
            if (jSONObject3.get("fileId") != null) {
                jSONObject5.put((JSONObject) "fileId", (String) jSONObject3.get("fileId"));
            }
            if (jSONObject3.get("width") != null) {
                jSONObject5.put((JSONObject) "width", (String) jSONObject3.get("width"));
            }
            if (jSONObject3.get("height") != null) {
                jSONObject5.put((JSONObject) "height", (String) jSONObject3.get("height"));
            }
            JSONObject a2 = a(jSONObject, i, jSONObject2);
            if (a2 != null) {
                a2.put((JSONObject) "pic", (String) jSONObject4);
            }
            jSONArray2.add(a2);
        }
        return jSONArray2;
    }

    private final JSONObject a(JSONObject jSONObject, int i, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e67fa4f5", new Object[]{this, jSONObject, new Integer(i), jSONObject2});
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "commentNamespace", "10000");
        jSONObject4.put((JSONObject) "cLikeNamespace", "1000");
        jSONObject4.put((JSONObject) "pLikeNamespace", "1321");
        jSONObject4.put((JSONObject) "vLikeNamespace", "1322");
        jSONObject4.put((JSONObject) "browseNamespace", "9000");
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = jSONObject5;
        Object obj = jSONObject.get("userNick");
        if (obj == null) {
            obj = jSONObject2 != null ? jSONObject2.get("userNick") : null;
        }
        Object obj2 = "";
        if (obj == null) {
            obj = obj2;
        }
        jSONObject6.put((JSONObject) "nick", (String) obj);
        Object obj3 = jSONObject.get("headPicUrl");
        if (obj3 == null) {
            obj3 = obj2;
        }
        jSONObject6.put((JSONObject) "iconUrl", (String) obj3);
        Object obj4 = jSONObject.get("userIndexURL");
        if (obj4 == null) {
            obj4 = obj2;
        }
        jSONObject6.put((JSONObject) "detailUrl", (String) obj4);
        jSONObject4.put((JSONObject) "userInfo", (String) jSONObject5);
        Object obj5 = jSONObject.get("id");
        if (obj5 == null) {
            obj5 = obj2;
        }
        jSONObject4.put((JSONObject) "uniqueId", (String) obj5);
        Object obj6 = jSONObject.get("id");
        if (obj6 == null) {
            obj6 = obj2;
        }
        jSONObject4.put((JSONObject) "contentId", (String) obj6);
        Object obj7 = jSONObject.get("repeatBusiness");
        if (obj7 == null) {
            obj7 = obj2;
        }
        jSONObject4.put((JSONObject) "repeatBusiness", (String) obj7);
        jSONObject4.put((JSONObject) "orderIndex", (String) Integer.valueOf(i + 1));
        Object obj8 = jSONObject.get("feedback");
        if (obj8 == null) {
            obj8 = jSONObject.get("appendedFeedback");
        }
        if (obj8 == null) {
            obj8 = obj2;
        }
        jSONObject4.put((JSONObject) "content", (String) obj8);
        Object obj9 = jSONObject.get("feedbackTitle");
        if (obj9 == null) {
            obj9 = jSONObject.get("appendedFeedbackTitle");
        }
        if (obj9 == null) {
            obj9 = obj2;
        }
        jSONObject4.put((JSONObject) "contentTitle", (String) obj9);
        Object obj10 = jSONObject.get("rateSearchParam");
        if (obj10 == null) {
            obj10 = obj2;
        }
        jSONObject4.put((JSONObject) "rateSearchParam", (String) obj10);
        if (jSONObject.get("skuMap") != null) {
            jSONObject4.put((JSONObject) "skuMap", (String) jSONObject.get("skuMap"));
        }
        if (jSONObject.get("hasDetail") != null) {
            Object obj11 = jSONObject.get("share");
            if (obj11 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            jSONObject4.put((JSONObject) "detailUrl", (String) ((JSONObject) obj11).get("shareURL"));
            Object obj12 = jSONObject.get("share");
            if (obj12 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            Object obj13 = ((JSONObject) obj12).get("detailUrl");
            if (obj13 != null) {
                jSONObject4.put((JSONObject) "newDetailUrl", (String) obj13);
            }
        }
        if (jSONObject.get("commentUrl") != null) {
            jSONObject4.put((JSONObject) "commentUrl", (String) jSONObject.get("commentUrl"));
        }
        if (jSONObject.get("interactInfo") != null) {
            Object obj14 = jSONObject.get("interactInfo");
            if (obj14 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            JSONObject jSONObject7 = (JSONObject) obj14;
            JSONObject jSONObject8 = new JSONObject();
            JSONObject jSONObject9 = jSONObject8;
            Object obj15 = jSONObject7.get("commentCount");
            if (obj15 != null) {
                obj2 = obj15;
            }
            jSONObject9.put((JSONObject) "commentCount", (String) obj2);
            int i2 = jSONObject7.get("likeCount");
            if (i2 == null) {
                i2 = 0;
            }
            jSONObject9.put((JSONObject) "likeCount", (String) i2);
            boolean z = jSONObject7.get("alreadyLike");
            if (z == null) {
                z = false;
            }
            jSONObject9.put((JSONObject) "alreadyLike", (String) z);
            jSONObject4.put((JSONObject) "contentInteract", (String) jSONObject8);
        }
        if (jSONObject.get("userTag") != null) {
            jSONObject4.put((JSONObject) "userTag", (String) jSONObject.get("userTag"));
        }
        return jSONObject3;
    }
}
