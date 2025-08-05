package com.ali.alihadeviceevaluator.old;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f1807a;
    public String b;
    public float c;
    public float d;

    public int a(HardWareInfo hardWareInfo) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5aea3420", new Object[]{this, hardWareInfo})).intValue();
        }
        if (hardWareInfo == null) {
            return 0;
        }
        this.f1807a = hardWareInfo.g;
        this.b = hardWareInfo.h;
        this.c = hardWareInfo.d;
        this.d = hardWareInfo.e;
        String str = this.f1807a;
        if (str != null) {
            if (str.contains("Adreno")) {
                this.b = "高通";
                if (this.f1807a.contains("540") || this.f1807a.contains("530") || this.f1807a.contains("53") || this.f1807a.startsWith("Adreno (TM) 5") || this.f1807a.startsWith("Adreno (TM) 6")) {
                    if (this.c <= 2.0f && this.d <= 1.5f) {
                        return 9;
                    }
                } else if (!this.f1807a.startsWith("Adreno 5") && !this.f1807a.startsWith("Adreno 6")) {
                    if (!this.f1807a.contains("430")) {
                        if (!this.f1807a.contains("420") && !this.f1807a.contains("418")) {
                            if (this.f1807a.contains("510") || this.f1807a.contains("506") || this.f1807a.contains("505")) {
                                return 6;
                            }
                            if (this.f1807a.contains("330")) {
                                if (this.c > 2.3f) {
                                    return 6;
                                }
                            } else if (!this.f1807a.contains("405") && !this.f1807a.contains("320")) {
                                if (!this.f1807a.contains("225") && !this.f1807a.contains("305") && !this.f1807a.contains("306") && !this.f1807a.contains("308")) {
                                    if (!this.f1807a.contains("220")) {
                                        if (!this.f1807a.contains("205") && !this.f1807a.contains("203")) {
                                            if (!this.f1807a.contains("200")) {
                                                if (this.f1807a.startsWith("Adreno 4")) {
                                                    return 6;
                                                }
                                                if (this.f1807a.startsWith("Adreno 3")) {
                                                }
                                            }
                                            return 1;
                                        }
                                        return 2;
                                    }
                                }
                            }
                            return 5;
                        }
                        return 7;
                    }
                    return 8;
                }
                return 10;
            } else if (this.f1807a.contains("Mali")) {
                Build.HARDWARE.toLowerCase();
                if (!this.f1807a.contains("G71") && !this.f1807a.contains("G72")) {
                    if (!this.f1807a.contains("T880 MP") && !this.f1807a.contains("T880")) {
                        if (!this.f1807a.contains("T860")) {
                            if (!this.f1807a.contains("T830") && !this.f1807a.contains("T820")) {
                                if (this.f1807a.contains("400 MP")) {
                                    return 6;
                                }
                                if (!this.f1807a.contains("400") && !this.f1807a.contains("450")) {
                                    if (!this.f1807a.contains("T624") && !this.f1807a.contains("T678")) {
                                        if (this.f1807a.contains("T628")) {
                                            return 6;
                                        }
                                        if (!this.f1807a.contains("T604")) {
                                            if (this.f1807a.contains("T760") || this.f1807a.contains("T720")) {
                                                return 6;
                                            }
                                            i = 0;
                                        }
                                    }
                                    return 5;
                                }
                                return 2;
                            }
                            return 7;
                        }
                        return 8;
                    }
                    return 9;
                }
                i = 10;
                return i;
            } else if (!this.f1807a.contains("PowerVR")) {
                if (this.f1807a.contains("NVIDIA")) {
                    float f = this.c;
                    if (f < 1.8f) {
                        if (f >= 2.2f) {
                            return 6;
                        }
                        if (f < 2.0f) {
                            return f >= 1.8f ? 4 : 3;
                        }
                        return 5;
                    }
                } else if (this.f1807a.contains("Android Emulator")) {
                }
                return 8;
            } else {
                if (!this.f1807a.contains("SGX 530")) {
                    if (!this.f1807a.contains("SGX 535") && !this.f1807a.contains("SGX 531")) {
                        if (!this.f1807a.contains("SGX 544") && !this.f1807a.contains("SGX 543")) {
                            if (!this.f1807a.contains("G6200") && !this.f1807a.contains("6200") && !this.f1807a.contains("G6400") && !this.f1807a.contains("G6430") && !this.f1807a.contains("G6") && !this.f1807a.contains("6")) {
                                if (this.f1807a.contains("6450") || this.f1807a.contains("7")) {
                                    return 6;
                                }
                            }
                            return 5;
                        }
                    }
                    return 2;
                }
                return 1;
            }
        }
        return 0;
    }
}
