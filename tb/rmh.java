package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rmh extends rmj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1752453072);
    }

    public static /* synthetic */ Object ipc$super(rmh rmhVar, String str, Object... objArr) {
        if (str.hashCode() == -326148900) {
            super.a((View) objArr[0], (HashMap) objArr[1], (rlw) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.rmj, tb.rmg
    public void a(Object obj, String str, String str2, rlw rlwVar, String str3) {
        RelativeLayout relativeLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605ad635", new Object[]{this, obj, str, str2, rlwVar, str3});
        } else if (!(obj instanceof RelativeLayout) || (relativeLayout = (RelativeLayout) obj) == null) {
        } else {
            String str4 = rlz.a().g(str3).get(str2);
            if (!StringUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = rlz.a().d(str, str3).get(str2);
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            a(relativeLayout, hashMap, rlwVar);
        }
    }

    @Override // tb.rmj, tb.rmg
    public void a(Object obj, HashMap<String, Object> hashMap, rlw rlwVar) {
        RelativeLayout relativeLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedfb5c2", new Object[]{this, obj, hashMap, rlwVar});
        } else if (!(obj instanceof RelativeLayout) || (relativeLayout = (RelativeLayout) obj) == null || hashMap == null || hashMap.size() == 0) {
        } else {
            a(relativeLayout, hashMap, rlwVar);
        }
    }

    public void a(RelativeLayout relativeLayout, HashMap<String, Object> hashMap, rlw rlwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35e6f34e", new Object[]{this, relativeLayout, hashMap, rlwVar});
        } else if (relativeLayout != null && hashMap != null && hashMap.size() != 0) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                if (!StringUtils.isEmpty(valueOf)) {
                    Object value = entry.getValue();
                    try {
                        int a2 = rlp.a(valueOf);
                        boolean parseBoolean = Boolean.parseBoolean(value.toString());
                        switch (a2) {
                            case rlp.T_LAYOUT_CENTER_HORIZONTAL /* 10402 */:
                                if (!parseBoolean) {
                                    return;
                                }
                                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                                if (layoutParams == null) {
                                    break;
                                } else {
                                    layoutParams.addRule(14, -1);
                                    relativeLayout.setLayoutParams(layoutParams);
                                    break;
                                }
                            case rlp.T_LAYOUT_CENTER_VERTICAL /* 10403 */:
                                if (!parseBoolean) {
                                    return;
                                }
                                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                                if (layoutParams2 == null) {
                                    break;
                                } else {
                                    layoutParams2.addRule(15, -1);
                                    relativeLayout.setLayoutParams(layoutParams2);
                                    break;
                                }
                            case rlp.T_LAYOUT_CENTER_IN_PARENT /* 10404 */:
                                if (!parseBoolean) {
                                    return;
                                }
                                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                                if (layoutParams3 == null) {
                                    break;
                                } else {
                                    layoutParams3.addRule(13, -1);
                                    relativeLayout.setLayoutParams(layoutParams3);
                                    break;
                                }
                            case rlp.T_LAYOUT_ALIGN_PARENT_TOP /* 10405 */:
                                if (!parseBoolean) {
                                    return;
                                }
                                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                                if (layoutParams4 == null) {
                                    break;
                                } else {
                                    layoutParams4.addRule(10, -1);
                                    relativeLayout.setLayoutParams(layoutParams4);
                                    break;
                                }
                            case rlp.T_LAYOUT_ALIGN_PARENT_BOTTOM /* 10406 */:
                                if (!parseBoolean) {
                                    return;
                                }
                                RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                                if (layoutParams5 == null) {
                                    break;
                                } else {
                                    layoutParams5.addRule(12, -1);
                                    relativeLayout.setLayoutParams(layoutParams5);
                                    break;
                                }
                            case rlp.T_LAYOUT_ALIGN_PARENT_RIGHT /* 10407 */:
                                if (!parseBoolean) {
                                    return;
                                }
                                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                                if (layoutParams6 == null) {
                                    break;
                                } else {
                                    layoutParams6.addRule(11, -1);
                                    relativeLayout.setLayoutParams(layoutParams6);
                                    break;
                                }
                            case rlp.T_LAYOUT_ALIGN_PARENT_LEFT /* 10408 */:
                                if (!parseBoolean) {
                                    return;
                                }
                                RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                                if (layoutParams7 == null) {
                                    break;
                                } else {
                                    layoutParams7.addRule(9, -1);
                                    relativeLayout.setLayoutParams(layoutParams7);
                                    break;
                                }
                        }
                    } catch (Throwable th) {
                        rmn.a(th);
                    }
                }
            }
            super.a((View) relativeLayout, hashMap, (rlw) null);
        }
    }
}
