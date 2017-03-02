
package com.emenda.emendaklocwork.config;

import org.apache.commons.lang3.StringUtils;

import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.QueryParameter;

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import hudson.util.FormValidation;

import javax.servlet.ServletException;

import java.io.IOException;
import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;


public class KlocworkDesktopGateway extends AbstractDescribableImpl<KlocworkDesktopGateway> {

    private final String threshold;


    @DataBoundConstructor
    public KlocworkDesktopGateway(String threshold) {
        this.threshold = threshold;
    }
    public String getThreshold() {
        return threshold;
    }

    @Extension
    public static class DescriptorImpl extends Descriptor<KlocworkDesktopGateway> {
        public String getDisplayName() { return null; }

    }

}
