package com.taobao.taopai.material;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.bean.MaterialCategoryBean;
import com.taobao.taopai.material.bean.MaterialDetail;
import com.taobao.taopai.material.bean.MaterialListBean;
import com.taobao.taopai.material.bean.MaterialResource;
import com.taobao.taopai.material.bean.MusicCategoryBean;
import com.taobao.taopai.material.bean.MusicListBean;
import com.taobao.taopai.material.jni.ResourceJniInteract;
import com.taobao.taopai.material.request.materialcategory.b;
import com.taobao.taopai2.material.business.specified.SpecifiedFilterResultBean;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.qby;

/* loaded from: classes8.dex */
public class MaterialTestHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_LINE = "guangguang";
    private static final String TAG = "MaterialTest";
    private static boolean sInit;

    public native String testResource(String str);

    static {
        kge.a(1385112073);
        sInit = false;
    }

    public static void test(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04a79cf", new Object[]{context});
            return;
        }
        if (!sInit) {
            a.a(context, "guangguang", "taopai");
            sInit = true;
        }
        testResourceJni();
    }

    public static void testResourceJni() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47c0acc", new Object[0]);
            return;
        }
        String str = "Test result = " + ResourceJniInteract.getResourceFromCacheWithIdOrTag("algorithm_PixelAIKid");
    }

    private static void testSpecified() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c291d2c5", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(2196002L);
        arrayList.add(2196001L);
        new a().a("guangguang", "guangguang", 590, arrayList, new com.taobao.taopai2.material.business.specified.a() { // from class: com.taobao.taopai.material.MaterialTestHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taopai2.material.business.specified.a
            public void a(SpecifiedFilterResultBean specifiedFilterResultBean) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f6315f6e", new Object[]{this, specifiedFilterResultBean});
                    return;
                }
                String str = "onSuccess " + specifiedFilterResultBean.toString();
            }

            @Override // tb.qbu
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                String str3 = "onFail " + str + ", errorInfo = " + str2;
            }
        });
    }

    private static void testCategoryList(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0789b73", new Object[]{context});
        } else {
            new a().a(context, new com.taobao.taopai.material.request.materialcategory.a("guangguang", 101, 102001L), new b() { // from class: com.taobao.taopai.material.MaterialTestHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.qbu
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    }
                }

                @Override // com.taobao.taopai.material.request.materialcategory.b
                public void a(List<MaterialCategoryBean> list) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                        return;
                    }
                    String str = "testCategoryList onSuccess " + list.size();
                }
            });
        }
    }

    private static void testMaterialList(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e735c6a", new Object[]{context});
            return;
        }
        com.taobao.taopai.material.request.materiallist.b bVar = new com.taobao.taopai.material.request.materiallist.b(0, 50, 101, 102001L, 276003L, 1);
        bVar.a(false);
        bVar.a(300L);
        new a().a(context, bVar, new com.taobao.taopai.material.request.materiallist.a() { // from class: com.taobao.taopai.material.MaterialTestHelper.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qbu
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                }
            }

            @Override // com.taobao.taopai.material.request.materiallist.a
            public void a(MaterialListBean materialListBean) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6041b185", new Object[]{this, materialListBean});
                    return;
                }
                String str = "testMaterialList onSuccess " + materialListBean.getModel().size();
            }
        });
    }

    private static void testDownload(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deece027", new Object[]{context});
        } else {
            new a().a(context, new com.taobao.taopai.material.request.materialfile.b("guangguang", 1, 1, "434014", "http://ossgw.alicdn.com/videotool/material_platform/meiren/wanggoudaren.zip"), new com.taobao.taopai.material.request.materialfile.a() { // from class: com.taobao.taopai.material.MaterialTestHelper.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taopai.material.request.materialfile.a
                public void a(String str, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                        return;
                    }
                    String str4 = "download fail " + str3;
                }

                @Override // com.taobao.taopai.material.request.materialfile.a
                public void a(String str, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                        return;
                    }
                    String str2 = "download progress  " + i;
                }

                @Override // com.taobao.taopai.material.request.materialfile.a
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                        return;
                    }
                    String str3 = "download success " + str2;
                }
            });
        }
    }

    private static void testMaterialById(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae0e6db6", new Object[]{context});
        } else {
            new a().a(new com.taobao.taopai.material.request.materialdetail.b("guangguang", 14011), new com.taobao.taopai.material.request.materialdetail.a() { // from class: com.taobao.taopai.material.MaterialTestHelper.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taopai.material.request.materialdetail.a
                public void a(MaterialDetail materialDetail) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("23a98282", new Object[]{this, materialDetail});
                    } else {
                        materialDetail.toString();
                    }
                }

                @Override // tb.qbu
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                        return;
                    }
                    String str3 = " testMaterialById fail " + str2;
                }
            });
        }
    }

    private static void testMaterialRes(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a6a47a", new Object[]{context});
        } else {
            new a().a(context, new com.taobao.taopai.material.request.materialdetail.b("guangguang", 1262004), new qby() { // from class: com.taobao.taopai.material.MaterialTestHelper.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.qby
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // tb.qby
                public void a(MaterialResource materialResource) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a53722e5", new Object[]{this, materialResource});
                    } else {
                        materialResource.toString();
                    }
                }

                @Override // tb.qbu
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                        return;
                    }
                    String str3 = " testMaterialById fail " + str2;
                }
            });
        }
    }

    private static void testMusicTypeList(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb87a836", new Object[]{context});
        } else {
            new a().a(new com.taobao.taopai.material.request.musicetype.b("guangguang", 256), new com.taobao.taopai.material.request.musicetype.a() { // from class: com.taobao.taopai.material.MaterialTestHelper.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taopai.material.request.musicetype.a
                public void a(List<MusicCategoryBean> list) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                    } else {
                        list.toString();
                    }
                }

                @Override // tb.qbu
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                        return;
                    }
                    String str3 = " testMaterialById fail " + str2;
                }
            });
        }
    }

    private static void testMusicList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427e7bf8", new Object[0]);
            return;
        }
        new a().a(new com.taobao.taopai.material.request.musiclist.b(1, 2), new com.taobao.taopai.material.request.musiclist.a() { // from class: com.taobao.taopai.material.MaterialTestHelper.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taopai.material.request.musiclist.a
            public void a(MusicListBean musicListBean) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e69af1e3", new Object[]{this, musicListBean});
                }
            }

            @Override // tb.qbu
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                String str3 = " testMaterialById fail " + str2;
            }
        });
    }
}
