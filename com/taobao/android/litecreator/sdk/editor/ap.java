package com.taobao.android.litecreator.sdk.editor;

import mtopsdk.common.util.StringUtils;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.TemplateEditor;
import com.alibaba.marvel.java.TemplateTag;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.Beauty;
import com.taobao.android.litecreator.util.at;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class ap {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MeEditor b;
    private TemplateEditor c;
    private Beauty e;
    private String f;

    /* renamed from: a  reason: collision with root package name */
    private List<String> f13426a = new ArrayList();
    private List<String> d = new ArrayList();
    private boolean g = false;

    static {
        kge.a(1431697028);
    }

    public void a(MeEditor meEditor, TemplateEditor templateEditor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee78ad26", new Object[]{this, meEditor, templateEditor});
            return;
        }
        this.b = meEditor;
        this.c = templateEditor;
    }

    public void a(Beauty beauty, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b9198a", new Object[]{this, beauty, list});
            return;
        }
        this.f13426a = list;
        this.e = beauty;
        if (beauty == null) {
            return;
        }
        a(beauty);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.g = false;
        this.d.clear();
    }

    private void a(Beauty beauty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c0de99", new Object[]{this, beauty});
        } else if (this.b == null) {
            com.taobao.android.litecreator.util.u.d("BeautyMarvelImpl", "mNewEditor == null");
        } else {
            String str = beauty.mDirPath;
            if (!com.taobao.android.litecreator.util.k.a(str)) {
                com.taobao.android.litecreator.util.u.d("BeautyMarvelImpl", "beauty dirPath not exist " + str);
                return;
            }
            if (!this.g) {
                if (this.f13426a.size() == 1) {
                    this.g = this.b.addExtentionEffectForClip(this.f13426a.get(0), str, Beauty.BEAUTY_SHAPE_KEY, 2L) == 0;
                    this.f = this.f13426a.get(0);
                } else {
                    TemplateEditor templateEditor = this.c;
                    if (templateEditor != null) {
                        for (TemplateTag templateTag : templateEditor.getAllTemplateTags()) {
                            if (StringUtils.equals("mediasPlaceHolder", templateTag.type)) {
                                this.d.add(templateTag.target);
                                String clipLinkProject = this.b.getClipLinkProject(templateTag.target);
                                String clipLinkTargetClip = this.b.getClipLinkTargetClip(templateTag.target);
                                this.b.selectProject(clipLinkProject);
                                this.g = this.b.addExtentionEffectForClip(clipLinkTargetClip, str, Beauty.BEAUTY_SHAPE_KEY, 2L) == 0;
                                this.b.selectProject("");
                            }
                        }
                    }
                }
            }
            if (!this.g) {
                com.taobao.android.litecreator.util.u.d("BeautyMarvelImpl", "beauty add fail ");
            } else if (this.e.mDirtyType == 3) {
                for (Integer num : beauty.mBeautyValues.keySet()) {
                    int intValue = num.intValue();
                    float a2 = a(beauty.mBeautyValues.get(Integer.valueOf(intValue)));
                    com.taobao.android.litecreator.util.u.b("BeautyMarvelImpl", "beauty key = " + intValue + ",value = " + a2);
                    a("BeautyFilterModule_" + intValue, a2);
                }
                for (Integer num2 : beauty.mShapeValues.keySet()) {
                    int intValue2 = num2.intValue();
                    String str2 = "BeautyShapeModule_" + intValue2;
                    float a3 = a(beauty.mShapeValues.get(Integer.valueOf(intValue2)));
                    com.taobao.android.litecreator.util.u.b("BeautyMarvelImpl", "shape key = " + str2 + ",value = " + a3);
                    a(str2, a(Float.valueOf(a3)));
                }
            } else if (this.e.mDirtyType == 1) {
                String str3 = "BeautyFilterModule_" + this.e.mSingleKey;
                float floatValue = beauty.mBeautyValues.get(Integer.valueOf(this.e.mSingleKey)).floatValue();
                com.taobao.android.litecreator.util.u.b("BeautyMarvelImpl", "beauty key = " + str3 + ",value = " + floatValue);
                a(str3, a(Float.valueOf(floatValue)));
            } else if (this.e.mDirtyType == 2) {
                String str4 = "BeautyShapeModule_" + this.e.mSingleKey;
                float floatValue2 = beauty.mShapeValues.get(Integer.valueOf(this.e.mSingleKey)).floatValue();
                com.taobao.android.litecreator.util.u.b("BeautyMarvelImpl", "beautyShape key = " + str4 + ",value = " + floatValue2);
                a(str4, a(Float.valueOf(floatValue2)));
            }
        }
    }

    private void a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123a1ce", new Object[]{this, str, new Float(f)});
        } else if (this.f13426a.isEmpty() && !this.d.isEmpty()) {
            for (String str2 : this.d) {
                this.b.getCoreEditor().setNestedClipDblProp(str2, Beauty.BEAUTY_SHAPE_KEY, str, f);
            }
        } else {
            this.b.getCoreEditor().setProperty(this.f, Beauty.BEAUTY_SHAPE_KEY, str, f);
        }
    }

    private float a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a6251234", new Object[]{this, obj})).floatValue() : Math.max(at.a(obj), 0.01f);
    }
}
