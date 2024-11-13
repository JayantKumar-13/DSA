clc ; % Clear the command window
clear all; % Clear all variables
close all; % Close all figure windows

% Time vector with a step size of 0.02 seconds
t = 0:0.02:1 ;  % t represents time, defined as start : step :end
f = 4; % Set the frequency for both sine and cosine waves
y1 = sin(2*pi*f*t); % Compute the sine wave using the formula sin(2πft)
y2 = cos(2*pi*f*t); % Compute the cosine wave using the formula cos(2πft)

% Plot the Sine Wave
plot(t, y1, 'g-', 'MarkerSize', 6, 'LineWidth', 2); % Plot the sine wave with specific line properties
hold on; % Retain the sine wave plot so that the cosine wave can be plotted on the same graph

%% Plot the Cosine Wave
plot(t, y2, 'm-', 'MarkerSize', 6, 'LineWidth', 2); % Plot the cosine wave with specific line properties
% Use plot for continuous graphs; stem can be used for discrete points
% The graph shows two cycles since the frequency is set to 2
% You can change the frequency to 4 for more cycles

xlabel('Time'); % X-axis label representing time
ylabel('Amplitude', 'FontWeight', ''); % Y-axis label representing amplitude
title('Sine & Cosine Wave', 'FontSize', 14, 'FontWeight', 'Bold'); % Add title to the plot
grid on; % Enable grid lines for better visibility

legend('Sine Wave', 'Cosine Wave'); % Add a legend to differentiate between the sine and cosine waves
hold off; % Release the plot hold to allow new plots later


% Uncomment the following code to display the cosine wave on a separate graph

% figure(); % Open a new figure window for the cosine wave
% plot(t, y2, 'g*-', 'MarkerSize', 6, 'LineWidth', 2); % Plot cosine wave separately with markers
% xlabel('Time'); % Label for the x-axis in the new plot
% ylabel('Amplitude', 'FontWeight', 'Bold'); % Label for the y-axis with bold font
% title('Cosine Wave', 'FontSize', 14, 'FontWeight', 'Bold'); % Title

%% Plot the Square Wave (f=4)
z1 = 2 * ones(1, 50); % Define the high value of the square wave (2) repeated 50 times
z2 = zeros(1, 50); % Define the low value of the square wave (0) repeated 50 times
z = [z1, z2]; % Combine the high and low values to create one full cycle of the square wave
f = 4; % Number of square wave cycles to be generated
y = []; % Create an empty array to store the entire square wave signal
for i = 1:f % Loop through to create 'f' full cycles of the square wave
    y = [y, z]; % Append each cycle of the square wave to the signal
end
plot(y, 'r', 'MarkerSize', 5, 'LineWidth', 3); % Plot the square wave signal
title('Square Wave', 'FontSize', 15, 'FontWeight', 'Bold'); % Add title to the square wave plot
xlabel('Time', 'FontSize', 15,'FontWeight', 'Bold'); % Add x-axis label
ylabel('Amplitude', 'FontSize', 15,'FontWeight', 'Bold'); % Add y-axis label
grid on; % Enable grid for better visualization
% Plot the Triangular Wave
figure; % Open another figure window for the triangular wave 
x = 0:0.1:3; % Generate the rising part of the triangular wave
y = 2.9:-0.1:0.1; % Generate the falling part of the triangular wave
p = [x, y]; % Combine the rising and falling segments to form one complete cycle
f = 4; % Number of cycles for the triangular wave

u = []; % Initialize an empty array to store the full triangular wave signal
for i = 1:f % Loop to repeat the triangular wave for 'f' cycles
    u = [u, p]; % Append each full cycle to the overall signal
end
plot(u, 'r', 'LineWidth', 3); % Plot the triangular wave signal
title('Triangular Wave', 'FontSize', 15, 'FontWeight', 'Bold'); % Add a title to the plot
xlabel('Time','FontSize', 15, 'FontWeight', 'Bold'); % Label the x-axis
ylabel('Amplitude', 'FontSize', 15,'FontWeight', 'Bold'); % Label the y-axis
grid on; % Turn on the grid for easier visualization
1st practical






A). x(t)=3u(t)+6u(t+3)-0.5u(t-3)+6u(t+6)
B). x(t)=c.e(αt) for different values of c and α
1. C and alpha are real
. alpha>0
. alpha<0
2. C and alpha are complex
. Real part of x(t)
. Imaginary part of x(t)
C). Let x(t)=3.e(-0.5*t). Calculate y(t)= ∫ x(t).dt Plot y1(t)= ∫x(t).dt
               and y2(t)= (dx(t))/█(dt@) for real and complex values of c and α.
% Define the unit step function
u = @(t) heaviside(t);
% Define the function y as a combination of shifted and scaled unit step functions
y = 3*u(t) + 6*u(t+3) - 0.5*u(t-3) + 6*u(t+6);

% Plot the function y over the range [-20, 20] with a red line and linewidth of 2
fplot(y, [-20, 20], 'r-', 'Linewidth', 2); 
% Add a title to the plot with larger font
title('Plot for $y = 3u(t) + 6u(t+3) - 0.5u(t-3)+ 6u(t+6)$', 'interpreter', 'latex', 'FontSize', 18);
xlabel('t', 'FontSize', 18); % Label the x-axis with larger font
ylabel('Amplitude', 'FontSize', 18); % Label the y-axis with larger font
% Define symbolic variables
syms t c alpha;
% Define symbolic expression for an exponential function
y = @(t) c * exp(alpha * t); 
% Substitute real values for c and alpha
y1= subs(y, {c, alpha}, {2, 5}); 
y2= subs(y, {c, alpha}, {2, -5}); 
% Substitute complex values for c and alpha
y3 = subs(y, {c, alpha}, {1 + 2j, -0.2 + 1.2j}); 

% Create a 2x2 subplot grid
figure; 
% Plot for real exponential signal with positive alpha (in green)
subplot(2, 2, 1); 
fplot(y1, 'g-', 'LineWidth', 2); 
title({'Plot for $y_{1}(t) = \left(c e^{\alpha t}\right)$', 'where $\alpha > 0$ and $c=2$'}, 'interpreter', 'latex', 'FontSize', 16);
xlabel('t', 'FontSize', 16); 
ylabel('Amplitude', 'FontSize', 16);

% Plot for real exponential signal with negative alpha (in green)
subplot(2, 2, 2); 
fplot(y2, 'g-', 'LineWidth', 2); 
title({'Plot for $y_{2}(t) = \left(c e^{\alpha t}\right)$', 'where $\alpha < 0$ and $c=2$'}, 'interpreter', 'latex', 'FontSize', 16);
xlabel('t', 'FontSize', 16); 
ylabel('Amplitude', 'FontSize', 16);

% Plot for real part of the complex exponential signal (in purple)
subplot(2, 2, 3); 
fplot(real(y3), [-10, 10], 'm-', 'LineWidth', 2); 
xlabel('t', 'FontSize', 16); 
ylabel('Real part', 'FontSize', 16); 
title({'Plot for real part of $y_{3}(t) = \left(c e^{\alpha t}\right)$', 'where $c=1+2j$, $\alpha=-0.2+1.2j$'}, 'interpreter', 'latex', 'FontSize', 16);

% Plot for imaginary part of the complex exponential signal (in purple)
subplot(2, 2, 4); 
fplot(imag(y3), [-10, 10], 'm-', 'LineWidth', 2); 
xlabel('t', 'FontSize', 16); 
ylabel('Imaginary part', 'FontSize', 16); 
title({'Plot for imaginary part of $y_{3}(t) = \left(c e^{\alpha t}\right)$', 'where $c=1+2j$, $\alpha=-0.2+1.2j$'}, 'interpreter', 'latex', 'FontSize', 16);

% Super title for the whole figure with larger font
sgtitle('Exponential Signals for Real and Complex Parameters', 'FontSize', 20);

% Define symbolic variables
syms t c alpha;
% Define symbolic expressions for exponential functions
y = @(t) c * exp(alpha * t); 
x = 3 * exp(-0.5 * t); 
x1 = 3 * exp(0.5 * t); 
x2=(1+2j)*exp((0.1+0.5j)*t); 

% Calculate integrals and derivatives
y1 = int(x, t); 
y2 = diff(x, t); 
y3 = int(x1, t); 
y4 = diff(x1, t); 
y5 = int(x2,t); 
y6 = diff(x2,t); 

% Create a figure for all plots
figure; 

% Plot integral of 3*exp(-0.5*t) (in blue)
subplot(2, 2, 1); 
fplot(y1, 'b-', 'LineWidth', 2); 
title({'Plot for $y{1}(t) = \int 3 e^{-0.5 t} \, dt$', 'where $c = 3$, $\alpha = -0.5$'}, 'interpreter', 'latex', 'FontSize', 16);
xlabel('t', 'FontSize', 16); 
ylabel('y{1}(t)', 'FontSize', 16);

% Plot derivative of 3*exp(-0.5*t) (in blue)
subplot(2, 2, 2); 
fplot(y2, 'b-', 'LineWidth', 2); 
title({'Plot for $y{2}(t) = \frac{d}{dt} \left(3 e^{-0.5 t}\right)$', 'where $c = 3$, $\alpha = -0.5$'}, 'interpreter', 'latex', 'FontSize', 16);
xlabel('t', 'FontSize', 16); 
ylabel('y{2}(t)', 'FontSize', 16);

% Plot integral of 3*exp(0.5*t) (in red)
subplot(2, 2, 3); 
fplot(y3, 'r-', 'LineWidth', 2); 
title({'Plot for $y{3}(t) = \int 3 e^{0.5 t} \, dt$', 'where $c = 3$, $\alpha = 0.5$'}, 'interpreter', 'latex', 'FontSize', 16);
xlabel('t', 'FontSize', 16); 
ylabel('y{3}(t)', 'FontSize', 16);

% Plot derivative of 3*exp(0.5*t) (in red)
subplot(2, 2, 4); 
fplot(y4, 'r-', 'LineWidth', 2); 
title({'Plot for $y{4}(t) = \frac{d}{dt} \left(3 e^{0.5 t}\right)$', 'where $c = 3$, $\alpha = 0.5$'}, 'interpreter', 'latex', 'FontSize', 16);
xlabel('t', 'FontSize', 16); 
ylabel('y{4}(t)', 'FontSize', 16);

% Super title for real exponential functions with larger font
sgtitle('Plot of the Integrals and Derivatives of Exponential Functions $3 e^{-0.5 t}$ and $3 e^{0.5 t}$', 'interpreter', 'latex', 'FontSize', 20);

% Plot integrals and derivatives for complex parameters
figure; 

% Plot real part of the integral of complex exponential
subplot(2,2,1); 
fplot(real(y5),[-10,10],'c-','LineWidth',2); 
xlabel('t', 'FontSize', 16); 
ylabel('Real Part', 'FontSize', 16); 
title({'Plot for real part of $y{5}(t) = \int (1+2j) e^{(0.1+0.5j)t} \, dt$', 'where $c = 1+2j$, $\alpha = 0.1+0.5j$'}, 'interpreter', 'latex', 'FontSize', 16);

% Plot imaginary part of the integral of complex exponential (in orange)
subplot(2,2,2); 
fplot(imag(y6),[-10,10],'c-','LineWidth',2); 
xlabel('t', 'FontSize', 16); 
ylabel('Imaginary Part', 'FontSize', 16); 
title({'Plot for imaginary part of $y{5}(t) = \int (1+2j) e^{(0.1+0.5j)t} \, dt$', 'where $c = 1+2j$, $\alpha = 0.1+0.5j$'}, 'interpreter', 'latex', 'FontSize', 16);

% Plot real part of the derivative of complex exponential (in cyan)
subplot(2,2,3); 
fplot(real(y6),[-10,10],'y-','LineWidth',2); 
xlabel('t', 'FontSize', 16); 
ylabel('Real Part', 'FontSize', 16); 
title({'Plot for real part of $y{6}(t) = \frac{d}{dt} \left(1+2j) e^{(0.1+0.5j) t}\right)$', 'where $c = 1+2j$, $\alpha = 0.1+0.5j$'}, 'interpreter', 'latex', 'FontSize', 16);

% Plot imaginary part of the derivative of complex exponential (in cyan)
subplot(2,2,4); 
fplot(imag(y6),[-10,10],'y-','LineWidth',2); 
xlabel('t', 'FontSize', 16); 
ylabel('Imaginary Part', 'FontSize', 16); 
title({'Plot for imaginary part of $y{6}(t) = \frac{d}{dt} \left(1+2j) e^{(0.1+0.5j) t}\right)$', 'where $c = 1+2j$, $\alpha = 0.1+0.5j$'}, 'interpreter', 'latex', 'FontSize', 16);

% Super title for complex exponential functions with larger font
sgtitle('Plot of the derivative and integral of $y(t) = c \cdot e^{\alpha t}$ for complex values of $c$ and $\alpha$, where $c = 1 + 2j$ and $\alpha = 0.1 + 0.5j$', 'interpreter', 'latex', 'FontSize', 20);

2nd practical







3rd practical
% Define the input signals and their respective index arrays
% x represents the first signal with index array nx
% h represents the second signal with index array nh
x = [5, 4, 7, 9, 11];
nx = [-3, -2, -1, 0, 1];
h = [4, 16, 7, 8];
nh = [-1, 0, 1, 2];

% Using the custom convolution function
% This function calculates the convolution of x and h manually
[y, ny] = conv_1(x, nx, h, nh);

% Display the convolution result from the custom function
disp('Custom convolved output:');
disp(y);
disp('Index range of result:');
disp(ny);

% Convolution result using built-in function
y_builtin = conv(x, h);

% Plotting the input signals and convolution results in separate subplots

figure;

% Plot the first signal x[n]
subplot(2,2,1); % Subplot at position 1 (2 rows, 2 columns)
stem(nx, x, 'LineWidth', 2, 'Color', 'r'); % Red stem plot with line width 2
xlabel('n'); % Label for horizontal axis
ylabel('x[n]'); % Label for vertical axis
title('x[n]'); % Title of this subplot

% Plot the second signal h[n]
subplot(2,2,2); % Subplot at position 2
stem(nh, h, 'LineWidth', 2, 'Color', 'g'); % Green stem plot with line width 2
xlabel('n'); % Label for horizontal axis
ylabel('h[n]'); % Label for vertical axis
title('h[n]'); % Title of this subplot

% Plot the convolution result from the custom function
subplot(2,2,3); % Subplot at position 3
stem(ny, y, 'LineWidth', 2, 'Color', 'b'); % Blue stem plot with line width 2
xlabel('n'); % Label for horizontal axis
ylabel('y[n]'); % Label for vertical axis
title('y[n] = x[n] * h[n] (Custom Function)'); % Title of this subplot

% Plot the convolution result from MATLAB's built-in function
subplot(2,2,4); % Subplot at position 4
stem(ny, y_builtin(1:length(ny)), 'LineWidth', 2, 'Color', 'm'); % Magenta stem plot
xlabel('n'); % Label for horizontal axis
ylabel('y[n]'); % Label for vertical axis
title('y[n] = x[n] * h[n] (Built-in Function)'); % Title of this subplot

% Add a main title for the entire figure
sgtitle('Convolution y[n] = x[n] * h[n]'); % Overall title for the figure

[y, ny] = conv_1(x, nx, h, nh);

% Custom function for manual convolution
function [y, ny] = conv_1(x, nx, h, nh)
% Reverse the second signal and adjust its index
h_flip = flip(h);
nh_flip = flip(-nh);

% Define the start and end of the index range for the output
ys = nx(1) + nh(1);
ye = nx(end) + nh(end);

% Initialize the output array y and its index range
y = [];

% Loop over each time shift
for j = ys:ye
    % Shift the reversed nh by the current index j
    nh_flip_shifted = nh_flip + j;
    
    % Determine overlapping indices between the signals
    overlap_indices = intersect(nx, nh_flip_shifted);
    m = 0; % Initialize the sum for this shift
    
    % Calculate sum of products for overlapping elements
    for i = 1:length(overlap_indices)
        x_value = x(find(nx == overlap_indices(i)));
        h_value = h_flip(find(nh_flip_shifted == overlap_indices(i)));
        m = m + x_value * h_value;
    end
    
    % Append the computed sum to the output
    y = [y, m];
end

% Define the index range for the output signal
ny = ys:ye;
end









Practical 4
Aim: Continuous time convolution and computation of impulse response from
given equation.
Mathematical Equations:
	 
                                          y(t)= x(t)*h(t)=∫_0^t▒x(τ)h(t-τ)dτ
				  (B)
					Y[n]-0.5Y[n-1]+1.5Y[n-2]=3X[n]
Code:
Part (A)
.) Continuous Time convolution of  input signal x(t) and impulse response h(t).
In this equation:
	x(t) is the input signal.
	h(t) is the impulse response.
	τ is a variable for integration which representing the time shift.
	y(t) is the result of the convolution of  x(t) and h(t).

clc;                
close all;          
clear all;          

% Define symbolic variables for convolution
syms t z

% Create a function handle for the Heaviside step function, u(t)
u = @(t) heaviside(t);  % Returns 0 when t < 0 and 1 when t >= 0

% Define the input signal x(t) as a function handle
x = @(t) (u(t) - u(t - 5));  % x(t) is 1 within [0, 5), otherwise 0

% Define the impulse response h(t) as a function handle
h = @(t) (u(t) - u(t - 5));  % h(t) is 1 within [0, 5), otherwise 0

% Calculate the symbolic convolution of x(t) and h(t)
% z serves as a dummy variable for integration
y = int(x(z) * h(t - z), z, 0, t);

% Plot y(t), the result of the convolution, over the interval [0, 15]
fplot(y, [0, 15], 'blue', 'LineWidth', 1);  % Use fplot to plot the symbolic result

% Set the plot title
title('Symbolic Convolution y(t) = x(t) * h(t)');

% Label the x-axis as "Time t"
xlabel('Time t');

% Label the y-axis as "y(t)"
ylabel('y(t)');

Part (B)
Computation of impulse response from given differential equation
clc;                
close all;         
clear all;          

% Number of samples to compute
N = 10; 

% Coefficients for output y[n] and its past values
a = [1, -0.5, 1.5];  % Coefficients for y[n], y[n-1], y[n-2], etc.
b = [3];             % Coefficient for x[n]

% Define the impulse input signal delta[n]
delta = [1 zeros(1, N-1)]; 

% Define the time indices for delta[n] (input signal x[n])
nx = 0:N-1; 

% Initialize the impulse response h[n] and its time indices
h = zeros(1, N);
nh = 0:N-1;  

% Set initial condition for h[0] based on the input signal
h(1) = b(1) * delta(1);  

% Compute the impulse response using the difference equation
for n = 2:N
    % Compute the contribution from the input terms (RHS of the equation)
    input_sum = 0;
    for k = 1:min(n, length(b))
        input_sum = input_sum + b(k) * delta(n-k+1); 
    end
    
    % Compute the contribution from the output terms (LHS of the equation)
    output_sum = 0;
    for k = 2:min(n, length(a))  % Start from 2 to exclude a[0], which is y[n]
        if (n-k+1) > 0
            output_sum = output_sum + a(k) * h(n-k+1);  
        end
    end
    
    % Calculate h[n] based on the difference equation
    h(n) = (input_sum - output_sum) / a(1);
end
% Plot the calculated impulse response h[n]
stem(nh, h, 'blue', 'LineWidth', 1);
title('Impulse Response h[n] for y[n] - 0.5y[n-1] + 1.5y[n-2] = 3x[n]');







practical 5


Aim: Countinuous time fourier series coefficient of given x(t)
Mathematical Equation for Continous time fourier series:
			        1.
				   a_k=1/T ∫_(-∞)^∞▒〖x(t).e^(-jkw_o t) 〗 dt			
			      2.
				   x(t)=∑_(-∞)^∞▒〖a_k e^(-jw_o t) 〗
where T= time period,
   ak= fourier series coefficients,
   k=  harmonic magnitude,
   x(t)=Input signal,
   w_0= fundamental frequency=2π/T
Mathematical Equation for Continuous time fourier series:
				1.
				     x[n]=∑_(k=0)^(N-1)▒〖a_(k ) e^jkωn 〗
			          2.
				     a_k=1/N  ∑_(k=0)^(N-1)▒〖x[n]〗 e^(-jkωn)
where T= time period,
 N= number of samples,
 ak= fourier series coefficients,
k=  harmonic magnitude,
x(t)=Input signal,
w= fundamental frequency=2π/N

Code:
	Continuous time fourier series
syms t k;
T = 8; % Period of the signal
w = (2 * pi) / T; % Angular frequency
a = (1/T) * int(exp(-1i * k * w * t), t, [-2, 2]); % Calculate the Fourier coefficient
fs = []; % Initialize frequency response array

% Calculate fs for frequency indices
for m = -200:200
if m ~= 0
b = subs(a, {k}, [m]); % Substitute k with m for non-zero indices
fs = [fs b];

else
b = (1/T) * int(1, t, [-2, 2]); % Compute fs for m = 0
fs = [fs b];
end
end

m1 = -200:200; % Frequency index range

% First figure: Stem plot of fs
figure();
stem(m1, fs, 'filled', 'LineWidth', 1, 'MarkerSize', 3, 'Color', 'b');
xlabel('w - Frequency Index', 'FontWeight', 'bold');
ylabel('Fourier coefficient-a_k', 'FontWeight', 'bold');
title('Plot of a_k', 'FontSize', 12, 'FontWeight', 'bold');
grid on;

% Second figure: Continuous plot of the signal s
figure();
s = 0; % Initialize signal s

% Summation for signal representation
for m1 = -200:200
s = s + (fs(m1 + 201) * exp(1i * m1 * w * t)); % Accumulate signal components
end

fplot(real(s), [-10, 10], 'Color', 'r', 'LineWidth', 2);
xlabel('t - Time', 'FontWeight', 'bold');
ylabel('Signal x(t)', 'FontWeight', 'bold');
title('Continuous Signal x(t)', 'FontSize', 12, 'FontWeight', 'bold');
grid on;




b)	Discrete time fourier series
clc;
clear all;
close all;

% Define a discrete-time periodic signal
N = 8;  % Signal period (number of samples)
n = 0:N-1;  % Time indices for one period
x = [1 2 3 4 5 6 7 8];  % Discrete-time signal values x[n]

% Define the fundamental angular frequency
w0 = 2 * pi / N;

% Initialize the Fourier Series coefficients array (Discrete Fourier Series)
a_k = zeros(1, N);  

% Compute the Fourier Series coefficients a[k]
for k = 0:N-1
    a_k(k+1) = (1/N) * sum(x .* exp(-1i * k * w0 * n));  % Apply DFS formula
end

% Plot the magnitude and phase of Fourier Series coefficients
figure;
subplot(2,1,1);
stem(0:N-1, abs(a_k), 'filled', 'Color', 'magenta');
title('Magnitude of Fourier Coefficients: $$|a_k| = \frac{1}{N} \sum_{n=0}^{N-1} x[n] e^{-i k w_0 n}$$', 'Interpreter', 'latex');
xlabel('k');
ylabel('Magnitude |a_k|');
grid on;

subplot(2,1,2);
stem(0:N-1, angle(a_k), 'filled', 'Color', 'cyan');
title('Phase of Fourier Coefficients: $$\angle a_k = \arg \left( \frac{1}{N} \sum_{n=0}^{N-1} x[n] e^{-i k w_0 n} \right)$$', 'Interpreter', 'latex');
xlabel('k');
ylabel('Phase \angle a_k');
grid on;

% Reconstruct the input signal from the Fourier coefficients
x_reconstructed = zeros(1, N);
for n_reconstructed = 0:N-1
    for k = 0:N-1
        x_reconstructed(n_reconstructed+1) = x_reconstructed(n_reconstructed+1) + a_k(k+1) * exp(1i * k * w0 * n_reconstructed);
    end
end

% Plot the input signal using the reconstructed values
figure;
stem(n, real(x_reconstructed), 'filled', 'Color', 'blue');
title('Input Signal: $$x[n] = \sum_{k=0}^{N-1} a_k e^{i k w_0 n}$$', 'Interpreter', 'latex');
xlabel('n');
ylabel('x[n]');




practical 6


Aim: - Compute Fourier transform of x(t)
x(t) =  2t+2, -1<t<0
          -2t+2, 0<t<1
Mathematical equation:
				1.
				     a_k=∫_(t=-∞)^∞▒〖x(t) e^(-jωt) 〗dt
				2.
				    x(t)=∑_(k=-∞)^∞▒a_k  e^jkωt
Code:
clc;
close all;
clear all;

% Define symbolic variables for frequency and time
syms w t;

% Compute the Fourier transform of a piecewise-defined function
x = int((2*t + 2) * exp(-1i * w * t), t, -1, 0) + int((-2*t + 2) * exp(-1i * w * t), t, 0, 1);

% Initialize an array to store Fourier transform values at different frequencies
f = [];

% Define the frequency range from -10 to 10 in increments of 0.1
for b = -10:0.1:10
    if b ~= 0
        d = subs(x, {w}, [b]);  % Substitute the specific frequency value for w
        f = [f, d];  % Append result to the Fourier transform array
    else
        % Calculate the Fourier transform when frequency is zero (DC component)
        d = int((2*t + 2), t, -1, 0) + int((-2*t + 2), t, 0, 1);
        f = [f, d];  % Append result to the Fourier transform array
    end
end

% Calculate the magnitude and phase of the Fourier transform
magx = abs(f);
anx = angle(f);

% Define frequency values for plotting
b1 = -10:0.1:10;

% Create a figure window for plots
figure;

% Plot the magnitude of X(jω) versus frequency (ω)
subplot(1, 2, 1);
plot(b1, magx, 'blue', 'LineWidth', 2);  % Use blue color for magnitude plot
title('Magnitude of X(jω) vs ω', 'FontSize', 14, 'FontWeight', 'bold');
xlabel('ω', 'FontSize', 12);
ylabel('|X(jω)|', 'FontSize', 12);
grid on;

% Plot the phase of X(jω) versus frequency (ω)
subplot(1, 2, 2);
plot(b1, anx, 'green', 'LineWidth', 2);  % Use green color for phase plot
title('Phase of X(jω) vs ω', 'FontSize', 14, 'FontWeight', 'bold');
xlabel('ω', 'FontSize', 12);
ylabel('∠X(jω)', 'FontSize', 12);
grid on;
