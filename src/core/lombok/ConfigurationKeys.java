/*
 * Copyright (C) 2013 The Project Lombok Authors.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package lombok;

import lombok.core.FlagUsageType;
import lombok.core.configuration.ConfigurationKey;

/**
 * A container class containing all lombok configuration keys that do not belong to a specific annotation.
 */
public class ConfigurationKeys {
	private ConfigurationKeys() {}
	
	/**
	 * lombok configuration: {@code lombok.AnyConstructor.flagUsage} = {@code WARNING} | {@code ERROR}.
	 * 
	 * If set, <em>any</em> usage of {@code @AllArgsConstructor}, {@code @RequiredArgsConstructor}, or {@code @NoArgsConstructor} results in a warning / error.
	 */
	public static final ConfigurationKey<FlagUsageType> ANY_CONSTRUCTOR_FLAG_USAGE = new ConfigurationKey<FlagUsageType>("lombok.AnyConstructor.flagUsage") {};
	
	/**
	 * lombok configuration: {@code lombok.log.any.flagUsage} = {@code WARNING} | {@code ERROR}.
	 * 
	 * If set, <em>any</em> usage of any of the log annotations in {@code lombok.extern}{@code @Slf4j} results in a warning / error.
	 */
	public static final ConfigurationKey<FlagUsageType> ANY_LOG_FLAG_USAGE = new ConfigurationKey<FlagUsageType>("lombok.log.any.flagUsage") {};
	
	/**
	 * lombok configuration: {@code lombok.experimental.flagUsage} = {@code WARNING} | {@code ERROR}.
	 * 
	 * If set, <em>any</em> usage of any experimental features (from package {@code lombok.experimental}) that haven't been
	 * promoted to a main feature results in a warning / error.
	 */
	public static final ConfigurationKey<FlagUsageType> EXPERIMENTAL_FLAG_USAGE = new ConfigurationKey<FlagUsageType>("lombok.experimental.flagUsage") {};
}