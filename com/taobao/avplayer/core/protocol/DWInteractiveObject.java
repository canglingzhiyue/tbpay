package com.taobao.avplayer.core.protocol;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.IDWObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kcl;
import tb.kge;

/* loaded from: classes6.dex */
public class DWInteractiveObject implements IDWObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int sCONTROLLER_BAR_HEIGHT = 40;
    private JSONArray mAnchorArray;
    public JSONObject mData;
    private String mRenderOrientation;
    public String mSource;
    private long mStartTime = -1;
    private long mEndTime = -1;

    static {
        kge.a(1355358433);
        kge.a(-996138287);
    }

    public void setStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c94730", new Object[]{this, new Long(j)});
        } else {
            this.mStartTime = j;
        }
    }

    public void setEndTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e12d357", new Object[]{this, new Long(j)});
        } else {
            this.mEndTime = j;
        }
    }

    public long getStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue() : this.mStartTime;
    }

    public long getEndTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("250d18d", new Object[]{this})).longValue() : this.mEndTime;
    }

    public DWInteractiveObject(JSONObject jSONObject, String str) {
        this.mData = jSONObject;
        this.mSource = str;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        Object opt = this.mData.opt("type");
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public void setJsTemplate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65eebbb6", new Object[]{this, str});
            return;
        }
        try {
            this.mData.putOpt("jsTemplate", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String getJsTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd6343c0", new Object[]{this});
        }
        Object opt = this.mData.opt("jsTemplate");
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public String getJsTemplateUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5aaa7ae3", new Object[]{this});
        }
        Object opt = this.mData.opt("jsUrl");
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public String getJsData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fea0a710", new Object[]{this});
        }
        Object opt = this.mData.opt("jsData");
        return opt == null ? "" : opt.toString();
    }

    public String getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc2f24d9", new Object[]{this});
        }
        Object opt = this.mData.opt("layout");
        return opt == null ? "relative" : opt.toString();
    }

    public void setRenderOrientation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa254ea9", new Object[]{this, str});
        } else {
            this.mRenderOrientation = str;
        }
    }

    public String getRenderOrientation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6033d5", new Object[]{this});
        }
        if (this.mRenderOrientation == null) {
            Object opt = this.mData.opt("renderOrientation");
            this.mRenderOrientation = opt == null ? null : opt.toString();
        }
        return this.mRenderOrientation;
    }

    public void setAnchorArray(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c3a883", new Object[]{this, jSONArray});
        } else {
            this.mAnchorArray = jSONArray;
        }
    }

    public JSONArray getAnchorArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("447d7f9b", new Object[]{this});
        }
        if (this.mAnchorArray == null) {
            Object opt = this.mData.opt("anchorArray");
            this.mAnchorArray = opt == null ? null : (JSONArray) opt;
        }
        return this.mAnchorArray;
    }

    public String getStartAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86221c9e", new Object[]{this});
        }
        Object opt = this.mData.opt("startAnimations");
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public String getEndAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4436ae85", new Object[]{this});
        }
        Object opt = this.mData.opt("endAnimations");
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public static void assignLayoutParams(DWContext dWContext, FrameLayout.LayoutParams layoutParams, DWVideoScreenType dWVideoScreenType, float f, float f2, String str, boolean z) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77dcfe5", new Object[]{dWContext, layoutParams, dWVideoScreenType, new Float(f), new Float(f2), str, new Boolean(z)});
        } else if (dWContext == null || layoutParams == null) {
        } else {
            String str2 = TextUtils.isEmpty(str) ? "RB" : str;
            if (dWVideoScreenType == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                i = kcl.a(dWContext);
                i2 = kcl.b(dWContext);
            } else if (dWVideoScreenType == DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
                i = kcl.b((Context) dWContext.getActivity());
                i2 = kcl.b(dWContext.getActivity());
            } else {
                i = dWContext.mWidth;
                i2 = dWContext.mHeight;
            }
            int g = dWContext.getVideo().g();
            int h = dWContext.getVideo().h();
            float f3 = g / h;
            float f4 = i;
            float f5 = i2;
            float f6 = f4 / f5;
            if (dWContext.screenType() != dWVideoScreenType) {
                if (f3 > f6) {
                    h = (int) (f4 / f3);
                    g = i;
                } else {
                    g = (int) (f5 * f3);
                    h = i2;
                }
            }
            if (f < 0.0f || f2 < 0.0f || str2 == null) {
                layoutParams.rightMargin = kcl.a(dWContext.getActivity(), 1.0f);
                layoutParams.bottomMargin = kcl.a(dWContext.getActivity(), 42.0f);
                layoutParams.gravity = 85;
            } else if (str2.equals("RB")) {
                layoutParams.leftMargin = (int) (g * f);
                layoutParams.topMargin = (int) (h * f2);
                layoutParams.gravity = 51;
            } else if (str2.equals("RT")) {
                layoutParams.leftMargin = (int) (g * f);
                layoutParams.bottomMargin = (int) (h * (1.0f - f2));
                layoutParams.gravity = 83;
            } else if (str2.equals("LB")) {
                layoutParams.rightMargin = (int) (g * (1.0f - f));
                layoutParams.topMargin = (int) (h * f2);
                layoutParams.gravity = 53;
            } else if (str2.equals("LT")) {
                layoutParams.rightMargin = (int) (g * (1.0f - f));
                layoutParams.bottomMargin = (int) (h * (1.0f - f2));
                layoutParams.gravity = 85;
            }
            if (f3 < f6) {
                int i3 = (i - g) / 2;
                if ((layoutParams.gravity & 3) == 3) {
                    layoutParams.leftMargin += i3;
                } else if ((layoutParams.gravity & 5) != 5) {
                } else {
                    layoutParams.rightMargin += i3;
                }
            } else if (z) {
            } else {
                int i4 = (h - i2) / 2;
                if ((layoutParams.gravity & 48) == 48) {
                    layoutParams.topMargin -= i4;
                } else if ((layoutParams.gravity & 80) != 80) {
                } else {
                    layoutParams.bottomMargin -= i4;
                }
            }
        }
    }
}
