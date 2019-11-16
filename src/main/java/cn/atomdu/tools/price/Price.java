
package cn.atomdu.tools.price;

import java.math.BigDecimal;

/**
 * 金融价格计算
 */
public class Price {
    private BigDecimal value;

    public Price(double v) {
        this.value = new BigDecimal(String.valueOf(v));
    }

    public Price(String v) {
        if (v != null && v.length() > 0)
            this.value = new BigDecimal(v);
        else
            this.value = new BigDecimal("0");
    }

    public Price(int v) {
        this.value = new BigDecimal(String.valueOf(v));
    }

    public Price(long v) {
        this.value = new BigDecimal(String.valueOf(v));
    }

    public Price(float v) {
        this.value = new BigDecimal(String.valueOf(v));
    }

    public Price(short v) {
        this.value = new BigDecimal(String.valueOf(v));
    }

    public Price(Price v) {
        if (v != null)
            this.value = v.value;
    }


    /**
     * 加
     */
    public Price add(String v) {
        this.value = this.value.add(new BigDecimal(v));
        return this;
    }

    /**
     * 加
     */
    public Price add(double v) {
        this.value = this.value.add(new BigDecimal(String.valueOf(v)));
        return this;
    }

    /**
     * 加
     */
    public Price add(int v) {
        this.value = this.value.add(new BigDecimal(String.valueOf(v)));
        return this;
    }

    /**
     * 加
     */
    public Price add(long v) {
        this.value = this.value.add(new BigDecimal(String.valueOf(v)));
        return this;
    }

    /**
     * 加
     */
    public Price add(float v) {
        this.value = this.value.add(new BigDecimal(String.valueOf(v)));
        return this;
    }

    /**
     * 加
     */
    public Price add(short v) {
        this.value = this.value.add(new BigDecimal(String.valueOf(v)));
        return this;
    }

    /**
     * 减
     */
    public Price sub(String v) {
        this.value = this.value.subtract(new BigDecimal(v));
        return this;
    }

    /**
     * 减
     */
    public Price sub(double v) {
        this.value = this.value.subtract(new BigDecimal(String.valueOf(v)));
        return this;
    }

    /**
     * 减
     */
    public Price sub(int v) {
        this.value = this.value.subtract(new BigDecimal(String.valueOf(v)));
        return this;
    }

    /**
     * 减
     */
    public Price sub(long v) {
        this.value = this.value.subtract(new BigDecimal(String.valueOf(v)));
        return this;
    }

    /**
     * 减
     */
    public Price sub(float v) {
        this.value = this.value.subtract(new BigDecimal(String.valueOf(v)));
        return this;
    }

    /**
     * 减
     */
    public Price sub(short v) {
        this.value = this.value.subtract(new BigDecimal(String.valueOf(v)));
        return this;
    }

    /**
     * 乘
     */
    public Price mul(String v) {
        this.value = this.value.multiply(new BigDecimal(v));
        return this;
    }

    /**
     * 乘
     */
    public Price mul(double v) {
        this.value = this.value.multiply(new BigDecimal(String.valueOf(v)));
        return this;
    }

    /**
     * 乘
     */
    public Price mul(int v) {
        this.value = this.value.multiply(new BigDecimal(String.valueOf(v)));
        return this;
    }

    /**
     * 乘
     */
    public Price mul(long v) {
        this.value = this.value.multiply(new BigDecimal(String.valueOf(v)));
        return this;
    }

    /**
     * 乘
     */
    public Price mul(float v) {
        this.value = this.value.multiply(new BigDecimal(String.valueOf(v)));
        return this;
    }

    /**
     * 乘
     */
    public Price mul(short v) {
        this.value = this.value.multiply(new BigDecimal(String.valueOf(v)));
        return this;
    }

    /**
     * 除
     */
    public Price div(String v) {
        this.value = this.value.divide(new BigDecimal(v), 64, BigDecimal.ROUND_HALF_UP);
        return this;
    }

    /**
     * 除
     */
    public Price div(double v) {
        this.value = this.value.divide(new BigDecimal(String.valueOf(v)), 64, BigDecimal.ROUND_HALF_UP);
        return this;
    }

    /**
     * 除
     */
    public Price div(int v) {
        this.value = this.value.divide(new BigDecimal(String.valueOf(v)), 64, BigDecimal.ROUND_HALF_UP);
        return this;
    }

    /**
     * 除
     */
    public Price div(long v) {
        this.value = this.value.divide(new BigDecimal(String.valueOf(v)), 64, BigDecimal.ROUND_HALF_UP);
        return this;
    }

    /**
     * 除
     */
    public Price div(float v) {
        this.value = this.value.divide(new BigDecimal(String.valueOf(v)), 64, BigDecimal.ROUND_HALF_UP);
        return this;
    }

    /**
     * 除
     */
    public Price div(short v) {
        this.value = this.value.divide(new BigDecimal(String.valueOf(v)), 64, BigDecimal.ROUND_HALF_UP);
        return this;
    }

    /**
     * 提供精确的除法运算。当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入
     *
     * @param scale 表示需要精确到小数点以后几位
     * @return 两个参数的商
     */
    public String toStringOrEmpty(int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("保留的小数位数必须大于零");
        }
        if (value == null || value.doubleValue() == 0.00)
            return "";
        else
            return value.setScale(scale, BigDecimal.ROUND_HALF_UP).toString();
    }

    /**
     * 提供精确的除法运算。当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入
     *
     * @param scale 表示需要精确到小数点以后几位
     * @return 两个参数的商
     */
    public String toStringOrNull(int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("保留的小数位数必须大于零");
        }
        if (value == null || value.doubleValue() == 0.00)
            return null;
        else
            return value.setScale(scale, BigDecimal.ROUND_HALF_UP).toString();
    }

    /**
     * 提供精确的除法运算。当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入
     * <p>
     * 注意：通过double做比较是不准确的，所以此方法不建议使用，会出现奇怪的问题
     *
     * @param scale 表示需要精确到小数点以后几位
     * @param equal 比较的值
     * @param def   如果计算为0，则返回此值
     * @return 两个参数的商
     */
    @Deprecated
    public String toStringOrDefault(int scale, double equal, String def) {
        if (scale < 0) {
            throw new IllegalArgumentException("保留的小数位数必须大于零");
        }
        if (value == null || value.doubleValue() == equal)
            return def;
        else
            return value.setScale(scale, BigDecimal.ROUND_HALF_UP).toString();
    }

    /**
     * 提供精确的除法运算。当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入
     *
     * @param scale 表示需要精确到小数点以后几位
     * @param equal 比较的值
     * @param def   如果计算为0，则返回此值
     * @return 两个参数的商
     */
    public String toStringOrDefault(int scale, int equal, String def) {
        if (scale < 0) {
            throw new IllegalArgumentException("保留的小数位数必须大于零");
        }
        if (value == null || value.intValue() == equal)
            return def;
        else
            return value.setScale(scale, BigDecimal.ROUND_HALF_UP).toString();
    }

    /**
     * 提供精确的除法运算。当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入
     * <p>
     * 如果scale为1，则equal的小数点位数为1，否则不相等。例子：
     * 1. toStringOrDefault(1,"0.0",null)表示精确到小数点后1位，结果如果等于“0.0”则返回def，否则返回结果
     * 2. toStringOrDefault(2,"0.00","0.00")表示精确到小数点后2位，结果如果等于“0.00”则返回def，否则返回结果
     *
     * @param scale 表示需要精确到小数点以后几位
     * @param equal 比较的值
     * @param def   如果计算为0，则返回此值
     * @return 两个参数的商
     */
    public String toStringOrDefault(int scale, String equal, String def) {
        if (scale < 0) {
            throw new IllegalArgumentException("保留的小数位数必须大于零");
        }
        if (value == null || value.toString().equals(equal))
            return def;
        else
            return value.setScale(scale, BigDecimal.ROUND_HALF_UP).toString();
    }

//    /**
//     * 提供精确的除法运算。当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入
//     *
//     * @param scale 表示需要精确到小数点以后几位
//     * @return 两个参数的商
//     */
//    public String toPlainString(int scale) {
//        if (scale < 0) {
//            throw new IllegalArgumentException("保留的小数位数必须大于零");
//        }
//        return value.setScale(scale, BigDecimal.ROUND_HALF_UP).toPlainString();
//    }
//
//    /**
//     * 提供精确的除法运算。当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入
//     *
//     * @param scale 表示需要精确到小数点以后几位
//     * @return 两个参数的商
//     */
//    public String toEngineeringString(int scale) {
//        if (scale < 0) {
//            throw new IllegalArgumentException("保留的小数位数必须大于零");
//        }
//        return value.setScale(scale, BigDecimal.ROUND_HALF_UP).toEngineeringString();
//    }

    /**
     * 提供精确的除法运算。当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入
     *
     * @param scale 表示需要精确到小数点以后几位
     * @return 两个参数的商
     */
    public Double toDoubleOrNull(int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("保留的小数位数必须大于零");
        }
        if (value == null || value.doubleValue() == 0.00)
            return null;
        else
            return value.setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 提供精确的除法运算。当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入
     *
     * @param scale 表示需要精确到小数点以后几位
     * @return 两个参数的商
     */
    public double toDoubleOrZero(int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("保留的小数位数必须大于零");
        }
        if (value == null || value.doubleValue() == 0.0) {
            return 0.0;
        }
        return value.setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 提供精确的除法运算。当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入
     *
     * @param scale 表示需要精确到小数点以后几位
     * @return 两个参数的商
     */
    public double toIntValue(int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("保留的小数位数必须大于零");
        }
        return value.setScale(scale, BigDecimal.ROUND_HALF_UP).intValue();
    }

    /**
     * 提供精确的除法运算。当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入
     *
     * @param scale 表示需要精确到小数点以后几位
     * @return 两个参数的商
     */
    public double toFloatValue(int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("保留的小数位数必须大于零");
        }
        return value.setScale(scale, BigDecimal.ROUND_HALF_UP).floatValue();
    }

    /**
     * 提供精确的除法运算。当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入
     *
     * @param scale 表示需要精确到小数点以后几位
     * @return 两个参数的商
     */
    public double toLongValue(int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("保留的小数位数必须大于零");
        }
        return value.setScale(scale, BigDecimal.ROUND_HALF_UP).longValue();
    }

    /**
     * 提供精确的除法运算。当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入
     *
     * @param scale 表示需要精确到小数点以后几位
     * @return 两个参数的商
     */
    public short toShortValue(int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("保留的小数位数必须大于零");
        }
        return value.setScale(scale, BigDecimal.ROUND_HALF_UP).shortValue();
    }


}