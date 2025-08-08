package com.etao.feimagesearch.capture.dynamic.bean;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.hybrid.TBAlbumImg;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public final class MusOuterAlbumBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private Long createTime;
    private String imgKey;
    private Float imgRotation;
    private Integer index;
    private boolean remote;
    private String screenShots;

    static {
        kge.a(765158040);
        Companion = new a(null);
    }

    public MusOuterAlbumBean() {
        this(null, null, false, null, null, null, 63, null);
    }

    public static /* synthetic */ MusOuterAlbumBean copy$default(MusOuterAlbumBean musOuterAlbumBean, String str, Float f, boolean z, Integer num, String str2, Long l, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MusOuterAlbumBean) ipChange.ipc$dispatch("4add328d", new Object[]{musOuterAlbumBean, str, f, new Boolean(z), num, str2, l, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = musOuterAlbumBean.imgKey;
        }
        if ((i & 2) != 0) {
            f = musOuterAlbumBean.imgRotation;
        }
        Float f2 = f;
        if ((i & 4) != 0) {
            z = musOuterAlbumBean.remote;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            num = musOuterAlbumBean.index;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str2 = musOuterAlbumBean.screenShots;
        }
        String str3 = str2;
        if ((i & 32) != 0) {
            l = musOuterAlbumBean.createTime;
        }
        return musOuterAlbumBean.copy(str, f2, z2, num2, str3, l);
    }

    @JvmStatic
    public static final MusOuterAlbumBean parseFromJson(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MusOuterAlbumBean) ipChange.ipc$dispatch("6014c1fd", new Object[]{jSONObject}) : Companion.a(jSONObject);
    }

    public final String component1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7dfa78a5", new Object[]{this}) : this.imgKey;
    }

    public final Float component2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("b7f79125", new Object[]{this}) : this.imgRotation;
    }

    public final boolean component3() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f20ac61", new Object[]{this})).booleanValue() : this.remote;
    }

    public final Integer component4() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("d6e66785", new Object[]{this}) : this.index;
    }

    public final String component5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("98116321", new Object[]{this}) : this.screenShots;
    }

    public final Long component6() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("de9aea35", new Object[]{this}) : this.createTime;
    }

    public final MusOuterAlbumBean copy(String str, Float f, boolean z, Integer num, String screenShots, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MusOuterAlbumBean) ipChange.ipc$dispatch("46e05e58", new Object[]{this, str, f, new Boolean(z), num, screenShots, l});
        }
        q.c(screenShots, "screenShots");
        return new MusOuterAlbumBean(str, f, z, num, screenShots, l);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof MusOuterAlbumBean) {
                MusOuterAlbumBean musOuterAlbumBean = (MusOuterAlbumBean) obj;
                if (!q.a((Object) this.imgKey, (Object) musOuterAlbumBean.imgKey) || !q.a(this.imgRotation, musOuterAlbumBean.imgRotation) || this.remote != musOuterAlbumBean.remote || !q.a(this.index, musOuterAlbumBean.index) || !q.a((Object) this.screenShots, (Object) musOuterAlbumBean.screenShots) || !q.a(this.createTime, musOuterAlbumBean.createTime)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.imgKey;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Float f = this.imgRotation;
        int hashCode2 = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
        boolean z = this.remote;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = (hashCode2 + i2) * 31;
        Integer num = this.index;
        int hashCode3 = (i4 + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.screenShots;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.createTime;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MusOuterAlbumBean(imgKey=" + this.imgKey + ", imgRotation=" + this.imgRotation + ", remote=" + this.remote + ", index=" + this.index + ", screenShots=" + this.screenShots + ", createTime=" + this.createTime + riy.BRACKET_END_STR;
    }

    public MusOuterAlbumBean(String str, Float f, boolean z, Integer num, String screenShots, Long l) {
        q.c(screenShots, "screenShots");
        this.imgKey = str;
        this.imgRotation = f;
        this.remote = z;
        this.index = num;
        this.screenShots = screenShots;
        this.createTime = l;
    }

    public /* synthetic */ MusOuterAlbumBean(String str, Float f, boolean z, Integer num, String str2, Long l, int i, o oVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : num, (i & 16) != 0 ? "false" : str2, (i & 32) != 0 ? null : l);
    }

    public final String getImgKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("685167a7", new Object[]{this}) : this.imgKey;
    }

    public final void setImgKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41857aaf", new Object[]{this, str});
        } else {
            this.imgKey = str;
        }
    }

    public final Float getImgRotation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("b624667b", new Object[]{this}) : this.imgRotation;
    }

    public final void setImgRotation(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da494f3", new Object[]{this, f});
        } else {
            this.imgRotation = f;
        }
    }

    public final boolean getRemote() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2c3fa1c7", new Object[]{this})).booleanValue() : this.remote;
    }

    public final void setRemote(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f21abce5", new Object[]{this, new Boolean(z)});
        } else {
            this.remote = z;
        }
    }

    public final Integer getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("9408020a", new Object[]{this}) : this.index;
    }

    public final void setIndex(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4af700", new Object[]{this, num});
        } else {
            this.index = num;
        }
    }

    public final String getScreenShots() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("547930e2", new Object[]{this}) : this.screenShots;
    }

    public final void setScreenShots(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52641a3c", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.screenShots = str;
    }

    public final Long getCreateTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("53ced16f", new Object[]{this}) : this.createTime;
    }

    public final void setCreateTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdef3b31", new Object[]{this, l});
        } else {
            this.createTime = l;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1717375008);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final MusOuterAlbumBean a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MusOuterAlbumBean) ipChange.ipc$dispatch("5105c3a1", new Object[]{this, jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            String a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, TBAlbumImg.ATTR_IMG_KEY, "");
            if (StringUtils.isEmpty(a2)) {
                return null;
            }
            MusOuterAlbumBean musOuterAlbumBean = new MusOuterAlbumBean(null, null, false, null, null, null, 63, null);
            musOuterAlbumBean.setImgKey(a2);
            musOuterAlbumBean.setIndex(Integer.valueOf(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "index", 0)));
            musOuterAlbumBean.setImgRotation(Float.valueOf(com.taobao.android.searchbaseframe.util.a.a(jSONObject, TBAlbumImg.ATTR_IMG_ROTATION, 0.0f)));
            musOuterAlbumBean.setRemote(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "remote", false));
            String a3 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "screenShots", "false");
            q.a((Object) a3, "FastJsonParseUtil.parseS…, \"screenShots\", \"false\")");
            musOuterAlbumBean.setScreenShots(a3);
            musOuterAlbumBean.setCreateTime(Long.valueOf(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "createTime", -1L)));
            return musOuterAlbumBean;
        }
    }
}
