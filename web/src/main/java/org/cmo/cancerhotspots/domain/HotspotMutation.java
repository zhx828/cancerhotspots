package org.cmo.cancerhotspots.domain;

import com.univocity.parsers.annotations.Convert;
import com.univocity.parsers.annotations.Parsed;
import com.univocity.parsers.annotations.Trim;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

/**
 * @author Selcuk Onur Sumer
 */
public class HotspotMutation
{
    @Trim
    @Parsed(field = "Hugo Symbol")
    private String hugoSymbol;

    @Trim
    @Parsed(field = "Codon")
    private String codon;

    @Trim
    @Parsed(field = "Alt Common Codon Usage *")
    private String altCommonCodonUsage;

    @Trim
    @Convert(conversionClass = MapConversion.class)
    @Parsed(field = "Variant Amino Acid")
    private Map<String, Integer> variantAminoAcid;

    @Trim
    @Parsed(field = "Q-value")
    private String qValue;

    @Trim
    @Parsed(field = "Tumor Count")
    private Integer tumorCount;

    @Trim
    @Parsed(field = "Tumor Type Count")
    private Integer tumorTypeCount;

    @Trim
    @Parsed(field = "Validation Level [a]")
    private String validationLevel;

    @Trim
    @Convert(conversionClass = MapConversion.class)
    @Parsed(field = "Tumor Type Composition")
    private Map<String, Integer> tumorTypeComposition;


    @ApiModelProperty(value = "Hugo symbol", required = true)
    public String getHugoSymbol()
    {
        return hugoSymbol;
    }

    public void setHugoSymbol(String hugoSymbol)
    {
        this.hugoSymbol = hugoSymbol;
    }

    @ApiModelProperty(value = "Codon", required = true)
    public String getCodon()
    {
        return codon;
    }

    public void setCodon(String codon)
    {
        this.codon = codon;
    }

    @ApiModelProperty(value = "Alternative Common Codon Usage", required = true)
    public String getAltCommonCodonUsage()
    {
        return altCommonCodonUsage;
    }

    public void setAltCommonCodonUsage(String altCommonCodonUsage)
    {
        this.altCommonCodonUsage = altCommonCodonUsage;
    }

    @ApiModelProperty(value = "Variant Amino Acid", required = true)
    public Map<String, Integer> getVariantAminoAcid()
    {
        return variantAminoAcid;
    }

    public void setVariantAminoAcid(Map<String, Integer> variantAminoAcid)
    {
        this.variantAminoAcid = variantAminoAcid;
    }

    @ApiModelProperty(value = "Q-value", required = true)
    public String getqValue()
    {
        return qValue;
    }

    public void setqValue(String qValue)
    {
        this.qValue = qValue;
    }

    @ApiModelProperty(value = "Number of Tumors", required = true)
    public Integer getTumorCount()
    {
        return tumorCount;
    }

    public void setTumorCount(Integer tumorCount)
    {
        this.tumorCount = tumorCount;
    }

    @ApiModelProperty(value = "Number of Distinct Tumor Types", required = true)
    public Integer getTumorTypeCount()
    {
        return tumorTypeCount;
    }

    public void setTumorTypeCount(Integer tumorTypeCount)
    {
        this.tumorTypeCount = tumorTypeCount;
    }

    @ApiModelProperty(value = "Validation Level", required = true)
    public String getValidationLevel()
    {
        return validationLevel;
    }

    public void setValidationLevel(String validationLevel)
    {
        this.validationLevel = validationLevel;
    }

    @ApiModelProperty(value = "Tumor Type Composition", required = true)
    public Map<String, Integer> getTumorTypeComposition()
    {
        return tumorTypeComposition;
    }

    public void setTumorTypeComposition(Map<String, Integer> tumorTypeComposition)
    {
        this.tumorTypeComposition = tumorTypeComposition;
    }
}
